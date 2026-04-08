package com.example.ecommerceapp.ui.favorites

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ecommerceapp.data.local.entity.FavoriteEntity
import com.example.ecommerceapp.repository.FavoriteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FavoritesViewModel @Inject constructor(
    private val favoriteRepository: FavoriteRepository
) : ViewModel() {

    private val _favoritesState = MutableStateFlow<List<FavoriteEntity>>(emptyList())
    val favoritesState: StateFlow<List<FavoriteEntity>> = _favoritesState

    init {
        viewModelScope.launch {
            favoriteRepository.getAllFavorites().collect {
                _favoritesState.value = it
            }
        }
    }

    fun removeFavorite(favorite: FavoriteEntity) {
        viewModelScope.launch {
            favoriteRepository.removeFavorite(favorite)
        }
    }
}
