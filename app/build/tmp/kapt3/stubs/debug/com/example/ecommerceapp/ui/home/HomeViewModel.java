package com.example.ecommerceapp.ui.home;

import androidx.lifecycle.ViewModel;
import com.example.ecommerceapp.data.model.Product;
import com.example.ecommerceapp.repository.ProductRepository;
import com.example.ecommerceapp.utils.Resource;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lcom/example/ecommerceapp/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "productRepository", "Lcom/example/ecommerceapp/repository/ProductRepository;", "<init>", "(Lcom/example/ecommerceapp/repository/ProductRepository;)V", "_productsState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/ecommerceapp/utils/Resource;", "", "Lcom/example/ecommerceapp/data/model/Product;", "productsState", "Lkotlinx/coroutines/flow/StateFlow;", "getProductsState", "()Lkotlinx/coroutines/flow/StateFlow;", "loadProducts", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.ecommerceapp.repository.ProductRepository productRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.ecommerceapp.utils.Resource<java.util.List<com.example.ecommerceapp.data.model.Product>>> _productsState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.ecommerceapp.utils.Resource<java.util.List<com.example.ecommerceapp.data.model.Product>>> productsState = null;
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.repository.ProductRepository productRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.ecommerceapp.utils.Resource<java.util.List<com.example.ecommerceapp.data.model.Product>>> getProductsState() {
        return null;
    }
    
    public final void loadProducts() {
    }
}