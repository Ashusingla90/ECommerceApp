package com.example.ecommerceapp.ui.upload;

import com.example.ecommerceapp.repository.AuthRepository;
import com.example.ecommerceapp.repository.ProductRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class UploadViewModel_Factory implements Factory<UploadViewModel> {
  private final Provider<ProductRepository> productRepositoryProvider;

  private final Provider<AuthRepository> authRepositoryProvider;

  public UploadViewModel_Factory(Provider<ProductRepository> productRepositoryProvider,
      Provider<AuthRepository> authRepositoryProvider) {
    this.productRepositoryProvider = productRepositoryProvider;
    this.authRepositoryProvider = authRepositoryProvider;
  }

  @Override
  public UploadViewModel get() {
    return newInstance(productRepositoryProvider.get(), authRepositoryProvider.get());
  }

  public static UploadViewModel_Factory create(
      Provider<ProductRepository> productRepositoryProvider,
      Provider<AuthRepository> authRepositoryProvider) {
    return new UploadViewModel_Factory(productRepositoryProvider, authRepositoryProvider);
  }

  public static UploadViewModel newInstance(ProductRepository productRepository,
      AuthRepository authRepository) {
    return new UploadViewModel(productRepository, authRepository);
  }
}
