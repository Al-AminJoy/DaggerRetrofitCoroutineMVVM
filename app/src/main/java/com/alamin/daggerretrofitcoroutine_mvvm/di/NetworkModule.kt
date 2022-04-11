package com.alamin.daggerretrofitcoroutine_mvvm.di

import com.alamin.daggerretrofitcoroutine_mvvm.model.network.APIInterface
import com.alamin.daggerretrofitcoroutine_mvvm.utils.Utils
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit{
        return Retrofit.Builder().baseUrl(Utils.BASE_URL)
            .addConverterFactory(GsonConverterFactory
                .create())
            .build()
    }

    @Singleton
    @Provides
    fun provideFakeAPI(retrofit: Retrofit): APIInterface{
        return retrofit.create(APIInterface::class.java)
    }

}