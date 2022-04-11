package com.alamin.daggerretrofitcoroutine_mvvm.model.network

import com.alamin.daggerretrofitcoroutine_mvvm.model.data.Product
import retrofit2.Response
import retrofit2.http.GET

interface APIInterface {
    @GET("products")
    suspend fun getProducts(): Response<List<Product>>
}