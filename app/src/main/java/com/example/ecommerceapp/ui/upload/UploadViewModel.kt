package com.example.ecommerceapp.ui.upload

import android.net.Uri
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ecommerceapp.data.model.Product
import com.example.ecommerceapp.repository.AuthRepository
import com.example.ecommerceapp.repository.ProductRepository
import com.example.ecommerceapp.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UploadViewModel @Inject constructor(
    private val productRepository: ProductRepository,
    private val authRepository: AuthRepository
) : ViewModel() {

    private val _uploadState = MutableStateFlow<Resource<Boolean>?>(null)
    val uploadState: StateFlow<Resource<Boolean>?> = _uploadState

    fun uploadProduct(title: String, description: String, price: String, imageUris: List<Uri>) {
        if (title.isBlank() || description.isBlank() || price.isBlank() || imageUris.isEmpty()) {
            _uploadState.value = Resource.Error("Please fill all fields and select at least one image")
            return
        }

        val priceDouble = price.toDoubleOrNull()
        if (priceDouble == null) {
            _uploadState.value = Resource.Error("Invalid price")
            return
        }

        val currentUser = authRepository.getCurrentUser()
        val uploaderName = currentUser?.displayName ?: "Unknown"
        val uploaderContact = currentUser?.email ?: "Unknown"

        val product = Product(
            title = title,
            description = description,
            price = priceDouble,
            uploaderName = uploaderName,
            uploaderContact = uploaderContact,
            uploadedAt = com.google.firebase.Timestamp.now()
        )

        viewModelScope.launch {
            productRepository.uploadProduct(product, imageUris).collect {
                _uploadState.value = it
            }
        }
    }

    fun resetState() {
        _uploadState.value = null
    }
}
