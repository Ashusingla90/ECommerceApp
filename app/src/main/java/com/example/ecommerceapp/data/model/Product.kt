package com.example.ecommerceapp.data.model

import com.google.firebase.Timestamp

data class Product(
    val id: String = "",
    val title: String = "",
    val description: String = "",
    val price: Double = 0.0,
    val imageUrls: List<String> = emptyList(),
    val uploaderId: String = "",
    val uploaderName: String = "",
    val uploaderContact: String = "",
    val uploadedAt: Timestamp? = null
)
