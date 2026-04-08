package com.example.ecommerceapp.di;

import com.example.ecommerceapp.data.remote.FakeStoreApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

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
public final class NetworkModule_ProvideFakeStoreApiServiceFactory implements Factory<FakeStoreApiService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideFakeStoreApiServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public FakeStoreApiService get() {
    return provideFakeStoreApiService(retrofitProvider.get());
  }

  public static NetworkModule_ProvideFakeStoreApiServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideFakeStoreApiServiceFactory(retrofitProvider);
  }

  public static FakeStoreApiService provideFakeStoreApiService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideFakeStoreApiService(retrofit));
  }
}
