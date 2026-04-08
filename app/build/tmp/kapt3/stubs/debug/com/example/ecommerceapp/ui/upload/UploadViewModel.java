package com.example.ecommerceapp.ui.upload;

import android.net.Uri;
import androidx.lifecycle.ViewModel;
import com.example.ecommerceapp.data.model.Product;
import com.example.ecommerceapp.repository.AuthRepository;
import com.example.ecommerceapp.repository.ProductRepository;
import com.example.ecommerceapp.utils.Resource;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\u0006\u0010\u0019\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lcom/example/ecommerceapp/ui/upload/UploadViewModel;", "Landroidx/lifecycle/ViewModel;", "productRepository", "Lcom/example/ecommerceapp/repository/ProductRepository;", "authRepository", "Lcom/example/ecommerceapp/repository/AuthRepository;", "<init>", "(Lcom/example/ecommerceapp/repository/ProductRepository;Lcom/example/ecommerceapp/repository/AuthRepository;)V", "_uploadState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/ecommerceapp/utils/Resource;", "", "uploadState", "Lkotlinx/coroutines/flow/StateFlow;", "getUploadState", "()Lkotlinx/coroutines/flow/StateFlow;", "uploadProduct", "", "title", "", "description", "price", "imageUris", "", "Landroid/net/Uri;", "resetState", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class UploadViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.ecommerceapp.repository.ProductRepository productRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.ecommerceapp.repository.AuthRepository authRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.ecommerceapp.utils.Resource<java.lang.Boolean>> _uploadState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.ecommerceapp.utils.Resource<java.lang.Boolean>> uploadState = null;
    
    @javax.inject.Inject()
    public UploadViewModel(@org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.repository.ProductRepository productRepository, @org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.repository.AuthRepository authRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.ecommerceapp.utils.Resource<java.lang.Boolean>> getUploadState() {
        return null;
    }
    
    public final void uploadProduct(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String price, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends android.net.Uri> imageUris) {
    }
    
    public final void resetState() {
    }
}