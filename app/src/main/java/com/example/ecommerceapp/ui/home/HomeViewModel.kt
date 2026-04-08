package com.example.ecommerceapp.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ecommerceapp.data.model.FakeStoreProduct
import com.example.ecommerceapp.data.model.Product
import com.example.ecommerceapp.repository.ProductRepository
import com.example.ecommerceapp.repository.RecommendedRepository
import com.example.ecommerceapp.utils.DataSeeder
import com.example.ecommerceapp.utils.Resource
import com.google.firebase.firestore.FirebaseFirestore
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val productRepository: ProductRepository,
    private val recommendedRepository: RecommendedRepository,
    private val firestore: FirebaseFirestore
) : ViewModel() {

    private val _productsState = MutableStateFlow<Resource<List<Product>>>(Resource.Loading())
    val productsState: StateFlow<Resource<List<Product>>> = _productsState

    private val _recommendedState = MutableStateFlow<Resource<List<FakeStoreProduct>>>(Resource.Loading())
    val recommendedState: StateFlow<Resource<List<FakeStoreProduct>>> = _recommendedState

    private val _seedState = MutableStateFlow<SeedState>(SeedState.Idle)
    val seedState: StateFlow<SeedState> = _seedState

    init {
        autoSeedAndLoadProducts()
        loadRecommendedProducts()
    }

    /**
     * Automatically seeds Firestore with dummy data if empty,
     * then loads all products. This ensures data shows on first launch.
     */
    private fun autoSeedAndLoadProducts() {
        viewModelScope.launch {
            // Seed only if no products exist (won't duplicate)
            DataSeeder.seedProducts(firestore)
            // Then load products from Firestore
            productRepository.getAllProducts().collect {
                _productsState.value = it
            }
        }
    }

    fun loadProducts() {
        viewModelScope.launch {
            productRepository.getAllProducts().collect {
                _productsState.value = it
            }
        }
    }

    fun loadRecommendedProducts() {
        viewModelScope.launch {
            recommendedRepository.getRecommendedProducts(limit = 10).collect {
                _recommendedState.value = it
            }
        }
    }

    fun seedDummyData() {
        viewModelScope.launch {
            _seedState.value = SeedState.Loading
            val result = DataSeeder.forceSeedProducts(firestore)
            result.onSuccess { count ->
                _seedState.value = if (count > 0) {
                    SeedState.Success("$count products added!")
                } else {
                    SeedState.Success("Products already exist.")
                }
                loadProducts()
            }.onFailure { error ->
                _seedState.value = SeedState.Error(error.message ?: "Seeding failed")
            }
        }
    }

    fun resetSeedState() {
        _seedState.value = SeedState.Idle
    }
}

sealed class SeedState {
    object Idle : SeedState()
    object Loading : SeedState()
    data class Success(val message: String) : SeedState()
    data class Error(val message: String) : SeedState()
}
