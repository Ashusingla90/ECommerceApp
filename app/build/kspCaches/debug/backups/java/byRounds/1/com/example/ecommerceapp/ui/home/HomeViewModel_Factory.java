package com.example.ecommerceapp.ui.home;

import com.example.ecommerceapp.repository.ProductRepository;
import com.example.ecommerceapp.repository.RecommendedRepository;
import com.google.firebase.firestore.FirebaseFirestore;
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
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<ProductRepository> productRepositoryProvider;

  private final Provider<RecommendedRepository> recommendedRepositoryProvider;

  private final Provider<FirebaseFirestore> firestoreProvider;

  public HomeViewModel_Factory(Provider<ProductRepository> productRepositoryProvider,
      Provider<RecommendedRepository> recommendedRepositoryProvider,
      Provider<FirebaseFirestore> firestoreProvider) {
    this.productRepositoryProvider = productRepositoryProvider;
    this.recommendedRepositoryProvider = recommendedRepositoryProvider;
    this.firestoreProvider = firestoreProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(productRepositoryProvider.get(), recommendedRepositoryProvider.get(), firestoreProvider.get());
  }

  public static HomeViewModel_Factory create(Provider<ProductRepository> productRepositoryProvider,
      Provider<RecommendedRepository> recommendedRepositoryProvider,
      Provider<FirebaseFirestore> firestoreProvider) {
    return new HomeViewModel_Factory(productRepositoryProvider, recommendedRepositoryProvider, firestoreProvider);
  }

  public static HomeViewModel newInstance(ProductRepository productRepository,
      RecommendedRepository recommendedRepository, FirebaseFirestore firestore) {
    return new HomeViewModel(productRepository, recommendedRepository, firestore);
  }
}
