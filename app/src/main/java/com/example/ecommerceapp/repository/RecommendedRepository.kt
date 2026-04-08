package com.example.ecommerceapp.repository

import com.example.ecommerceapp.data.model.FakeStoreProduct
import com.example.ecommerceapp.data.remote.FakeStoreApiService
import com.example.ecommerceapp.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RecommendedRepository @Inject constructor(
    private val apiService: FakeStoreApiService
) {

    fun getRecommendedProducts(limit: Int = 10): Flow<Resource<List<FakeStoreProduct>>> = flow {
        emit(Resource.Loading())
        try {
            val products = apiService.getAllProducts(limit)
            emit(Resource.Success(products))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Failed to fetch recommended products"))
        }
    }

    fun getProductById(productId: Int): Flow<Resource<FakeStoreProduct>> = flow {
        emit(Resource.Loading())
        try {
            val product = apiService.getProductById(productId)
            emit(Resource.Success(product))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Failed to fetch product details"))
        }
    }

    fun getProductsByCategory(category: String): Flow<Resource<List<FakeStoreProduct>>> = flow {
        emit(Resource.Loading())
        try {
            val products = apiService.getProductsByCategory(category)
            emit(Resource.Success(products))
        } catch (e: Exception) {
            emit(Resource.Error(e.message ?: "Failed to fetch products by category"))
        }
    }
}
