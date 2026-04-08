package com.example.ecommerceapp.ui.detail;

import com.example.ecommerceapp.repository.FavoriteRepository;
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
public final class ProductDetailViewModel_Factory implements Factory<ProductDetailViewModel> {
  private final Provider<ProductRepository> productRepositoryProvider;

  private final Provider<FavoriteRepository> favoriteRepositoryProvider;

  public ProductDetailViewModel_Factory(Provider<ProductRepository> productRepositoryProvider,
      Provider<FavoriteRepository> favoriteRepositoryProvider) {
    this.productRepositoryProvider = productRepositoryProvider;
    this.favoriteRepositoryProvider = favoriteRepositoryProvider;
  }

  @Override
  public ProductDetailViewModel get() {
    return newInstance(productRepositoryProvider.get(), favoriteRepositoryProvider.get());
  }

  public static ProductDetailViewModel_Factory create(
      Provider<ProductRepository> productRepositoryProvider,
      Provider<FavoriteRepository> favoriteRepositoryProvider) {
    return new ProductDetailViewModel_Factory(productRepositoryProvider, favoriteRepositoryProvider);
  }

  public static ProductDetailViewModel newInstance(ProductRepository productRepository,
      FavoriteRepository favoriteRepository) {
    return new ProductDetailViewModel(productRepository, favoriteRepository);
  }
}
