package com.example.ecommerceapp.ui.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ecommerceapp.data.local.entity.FavoriteEntity
import com.example.ecommerceapp.data.model.FakeStoreProduct
import com.example.ecommerceapp.repository.FavoriteRepository
import com.example.ecommerceapp.repository.RecommendedRepository
import com.example.ecommerceapp.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RecommendedDetailViewModel @Inject constructor(
    private val recommendedRepository: RecommendedRepository,
    private val favoriteRepository: FavoriteRepository
) : ViewModel() {

    private val _productState = MutableStateFlow<Resource<FakeStoreProduct>>(Resource.Loading())
    val productState: StateFlow<Resource<FakeStoreProduct>> = _productState

    private val _isFavorite = MutableStateFlow(false)
    val isFavorite: StateFlow<Boolean> = _isFavorite

    fun loadProduct(productId: Int) {
        viewModelScope.launch {
            recommendedRepository.getProductById(productId).collect {
                _productState.value = it
                if (it is Resource.Success) {
                    checkIfFavorite("recommended_${it.data.id}")
                }
            }
        }
    }

    private fun checkIfFavorite(productId: String) {
        viewModelScope.launch {
            val fav = favoriteRepository.getFavoriteById(productId)
            _isFavorite.value = fav != null
        }
    }

    fun toggleFavorite(product: FakeStoreProduct) {
        viewModelScope.launch {
            val favId = "recommended_${product.id}"
            val currentFav = favoriteRepository.getFavoriteById(favId)
            if (currentFav != null) {
                favoriteRepository.removeFavorite(currentFav)
                _isFavorite.value = false
            } else {
                val newFav = FavoriteEntity(
                    productId = favId,
                    title = product.title,
                    description = product.description,
                    price = product.price,
                    imageUrl = product.image,
                    uploaderName = "FakeStore – ${product.category}"
                )
                favoriteRepository.addFavorite(newFav)
                _isFavorite.value = true
            }
        }
    }
}
