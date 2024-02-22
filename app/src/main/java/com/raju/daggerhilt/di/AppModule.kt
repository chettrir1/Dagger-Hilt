package com.raju.daggerhilt.di

import com.raju.daggerhilt.data.remote.MyApi
import com.raju.daggerhilt.data.repository.MyRepositoryClassImpl
import com.raju.daggerhilt.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideMyApi(): MyApi {
        return Retrofit.Builder()
            .baseUrl("https://test.com")
            .build()
            .create(MyApi::class.java)
    }

    @Provides
    @Singleton
    fun provideMyRepository(api: MyApi): MyRepository {
        return MyRepositoryClassImpl(api)
    }
}