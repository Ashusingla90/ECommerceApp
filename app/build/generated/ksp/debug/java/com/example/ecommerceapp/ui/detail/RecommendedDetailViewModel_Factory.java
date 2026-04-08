package com.example.ecommerceapp.ui.detail;

import com.example.ecommerceapp.repository.FavoriteRepository;
import com.example.ecommerceapp.repository.RecommendedRepository;
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
public final class RecommendedDetailViewModel_Factory implements Factory<RecommendedDetailViewModel> {
  private final Provider<RecommendedRepository> recommendedRepositoryProvider;

  private final Provider<FavoriteRepository> favoriteRepositoryProvider;

  public RecommendedDetailViewModel_Factory(
      Provider<RecommendedRepository> recommendedRepositoryProvider,
      Provider<FavoriteRepository> favoriteRepositoryProvider) {
    this.recommendedRepositoryProvider = recommendedRepositoryProvider;
    this.favoriteRepositoryProvider = favoriteRepositoryProvider;
  }

  @Override
  public RecommendedDetailViewModel get() {
    return newInstance(recommendedRepositoryProvider.get(), favoriteRepositoryProvider.get());
  }

  public static RecommendedDetailViewModel_Factory create(
      Provider<RecommendedRepository> recommendedRepositoryProvider,
      Provider<FavoriteRepository> favoriteRepositoryProvider) {
    return new RecommendedDetailViewModel_Factory(recommendedRepositoryProvider, favoriteRepositoryProvider);
  }

  public static RecommendedDetailViewModel newInstance(RecommendedRepository recommendedRepository,
      FavoriteRepository favoriteRepository) {
    return new RecommendedDetailViewModel(recommendedRepository, favoriteRepository);
  }
}
