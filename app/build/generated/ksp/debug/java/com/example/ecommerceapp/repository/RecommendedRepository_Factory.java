package com.example.ecommerceapp.repository;

import com.example.ecommerceapp.data.remote.FakeStoreApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class RecommendedRepository_Factory implements Factory<RecommendedRepository> {
  private final Provider<FakeStoreApiService> apiServiceProvider;

  public RecommendedRepository_Factory(Provider<FakeStoreApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public RecommendedRepository get() {
    return newInstance(apiServiceProvider.get());
  }

  public static RecommendedRepository_Factory create(
      Provider<FakeStoreApiService> apiServiceProvider) {
    return new RecommendedRepository_Factory(apiServiceProvider);
  }

  public static RecommendedRepository newInstance(FakeStoreApiService apiService) {
    return new RecommendedRepository(apiService);
  }
}
