package com.example.ecommerceapp.ui.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ecommerceapp.data.local.entity.FavoriteEntity
import com.example.ecommerceapp.data.model.Product
import com.example.ecommerceapp.repository.FavoriteRepository
import com.example.ecommerceapp.repository.ProductRepository
import com.example.ecommerceapp.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductDetailViewModel @Inject constructor(
    private val productRepository: ProductRepository,
    private val favoriteRepository: FavoriteRepository
) : ViewModel() {

    private val _productState = MutableStateFlow<Resource<Product>>(Resource.Loading())
    val productState: StateFlow<Resource<Product>> = _productState

    private val _isFavorite = MutableStateFlow(false)
    val isFavorite: StateFlow<Boolean> = _isFavorite

    fun loadProduct(productId: String) {
        viewModelScope.launch {
            productRepository.getProductById(productId).collect {
                _productState.value = it
                if (it is Resource.Success) {
                    checkIfFavorite(it.data.id)
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

    fun toggleFavorite(product: Product) {
        viewModelScope.launch {
            val currentFav = favoriteRepository.getFavoriteById(product.id)
            if (currentFav != null) {
                favoriteRepository.removeFavorite(currentFav)
                _isFavorite.value = false
            } else {
                val newFav = FavoriteEntity(
                    productId = product.id,
                    title = product.title,
                    description = product.description,
                    price = product.price,
                    imageUrl = product.imageUrls.firstOrNull() ?: "",
                    uploaderName = product.uploaderName
                )
                favoriteRepository.addFavorite(newFav)
                _isFavorite.value = true
            }
        }
    }

    fun deleteProduct(productId: String, onDeleted: () -> Unit) {
        viewModelScope.launch {
            productRepository.deleteProduct(productId).collect {
                if (it is Resource.Success) {
                    onDeleted()
                }
            }
        }
    }
}
