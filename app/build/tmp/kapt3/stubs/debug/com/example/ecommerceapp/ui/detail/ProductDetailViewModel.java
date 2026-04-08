package com.example.ecommerceapp.ui.detail;

import androidx.lifecycle.ViewModel;
import com.example.ecommerceapp.data.local.entity.FavoriteEntity;
import com.example.ecommerceapp.data.model.Product;
import com.example.ecommerceapp.repository.FavoriteRepository;
import com.example.ecommerceapp.repository.ProductRepository;
import com.example.ecommerceapp.utils.Resource;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u000bJ\u001c\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f\u00a8\u0006\u001d"}, d2 = {"Lcom/example/ecommerceapp/ui/detail/ProductDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "productRepository", "Lcom/example/ecommerceapp/repository/ProductRepository;", "favoriteRepository", "Lcom/example/ecommerceapp/repository/FavoriteRepository;", "<init>", "(Lcom/example/ecommerceapp/repository/ProductRepository;Lcom/example/ecommerceapp/repository/FavoriteRepository;)V", "_productState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/ecommerceapp/utils/Resource;", "Lcom/example/ecommerceapp/data/model/Product;", "productState", "Lkotlinx/coroutines/flow/StateFlow;", "getProductState", "()Lkotlinx/coroutines/flow/StateFlow;", "_isFavorite", "", "isFavorite", "loadProduct", "", "productId", "", "checkIfFavorite", "toggleFavorite", "product", "deleteProduct", "onDeleted", "Lkotlin/Function0;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class ProductDetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.ecommerceapp.repository.ProductRepository productRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.ecommerceapp.repository.FavoriteRepository favoriteRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.ecommerceapp.utils.Resource<com.example.ecommerceapp.data.model.Product>> _productState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.ecommerceapp.utils.Resource<com.example.ecommerceapp.data.model.Product>> productState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isFavorite = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isFavorite = null;
    
    @javax.inject.Inject()
    public ProductDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.repository.ProductRepository productRepository, @org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.repository.FavoriteRepository favoriteRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.ecommerceapp.utils.Resource<com.example.ecommerceapp.data.model.Product>> getProductState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isFavorite() {
        return null;
    }
    
    public final void loadProduct(@org.jetbrains.annotations.NotNull()
    java.lang.String productId) {
    }
    
    private final void checkIfFavorite(java.lang.String productId) {
    }
    
    public final void toggleFavorite(@org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.data.model.Product product) {
    }
    
    public final void deleteProduct(@org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDeleted) {
    }
}