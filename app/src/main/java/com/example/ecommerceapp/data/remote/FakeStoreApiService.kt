package com.example.ecommerceapp.data.remote

import com.example.ecommerceapp.data.model.FakeStoreProduct
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Retrofit service interface for the FakeStore API.
 * Base URL: https://fakestoreapi.com/
 */
interface FakeStoreApiService {

    @GET("products")
    suspend fun getAllProducts(
        @Query("limit") limit: Int = 10
    ): List<FakeStoreProduct>

    @GET("products/{id}")
    suspend fun getProductById(
        @Path("id") productId: Int
    ): FakeStoreProduct

    @GET("products/category/{category}")
    suspend fun getProductsByCategory(
        @Path("category") category: String
    ): List<FakeStoreProduct>

    @GET("products/categories")
    suspend fun getCategories(): List<String>
}
