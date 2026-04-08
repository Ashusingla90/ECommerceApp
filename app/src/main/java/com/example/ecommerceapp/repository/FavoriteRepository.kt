package com.example.ecommerceapp.repository

import com.example.ecommerceapp.data.local.dao.FavoriteDao
import com.example.ecommerceapp.data.local.entity.FavoriteEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FavoriteRepository @Inject constructor(
    private val dao: FavoriteDao
) {
    fun getAllFavorites(): Flow<List<FavoriteEntity>> = dao.getAllFavorites()
    
    suspend fun addFavorite(entity: FavoriteEntity) = dao.addFavorite(entity)
    
    suspend fun removeFavorite(entity: FavoriteEntity) = dao.removeFavorite(entity)
    
    suspend fun getFavoriteById(id: String): FavoriteEntity? = dao.getFavoriteById(id)
}
