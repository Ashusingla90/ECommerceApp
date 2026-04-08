package com.example.ecommerceapp.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favorites")
data class FavoriteEntity(
    @PrimaryKey val productId: String,
    val title: String,
    val description: String,
    val price: Double,
    val imageUrl: String,
    val uploaderName: String
)
