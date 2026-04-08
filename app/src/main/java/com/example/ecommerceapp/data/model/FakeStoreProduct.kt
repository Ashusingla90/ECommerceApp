package com.example.ecommerceapp.data.model

import com.google.gson.annotations.SerializedName

/**
 * Data class matching the FakeStore API response format.
 * API: https://fakestoreapi.com/products
 */
data class FakeStoreProduct(
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("price") val price: Double,
    @SerializedName("description") val description: String,
    @SerializedName("category") val category: String,
    @SerializedName("image") val image: String,
    @SerializedName("rating") val rating: Rating
)

data class Rating(
    @SerializedName("rate") val rate: Double,
    @SerializedName("count") val count: Int
)
