package com.example.ecommerceapp.ui.favorites;

import androidx.lifecycle.ViewModel;
import com.example.ecommerceapp.data.local.entity.FavoriteEntity;
import com.example.ecommerceapp.repository.FavoriteRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0011"}, d2 = {"Lcom/example/ecommerceapp/ui/favorites/FavoritesViewModel;", "Landroidx/lifecycle/ViewModel;", "favoriteRepository", "Lcom/example/ecommerceapp/repository/FavoriteRepository;", "<init>", "(Lcom/example/ecommerceapp/repository/FavoriteRepository;)V", "_favoritesState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/example/ecommerceapp/data/local/entity/FavoriteEntity;", "favoritesState", "Lkotlinx/coroutines/flow/StateFlow;", "getFavoritesState", "()Lkotlinx/coroutines/flow/StateFlow;", "removeFavorite", "", "favorite", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class FavoritesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.ecommerceapp.repository.FavoriteRepository favoriteRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.ecommerceapp.data.local.entity.FavoriteEntity>> _favoritesState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.ecommerceapp.data.local.entity.FavoriteEntity>> favoritesState = null;
    
    @javax.inject.Inject()
    public FavoritesViewModel(@org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.repository.FavoriteRepository favoriteRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.ecommerceapp.data.local.entity.FavoriteEntity>> getFavoritesState() {
        return null;
    }
    
    public final void removeFavorite(@org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.data.local.entity.FavoriteEntity favorite) {
    }
}