package com.alamin.daggerretrofitcoroutine_mvvm.model.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.alamin.daggerretrofitcoroutine_mvvm.model.data.Product
import com.alamin.daggerretrofitcoroutine_mvvm.model.network.APIInterface
import retrofit2.Response
import javax.inject.Inject

class ProductRepository @Inject constructor(private val apiInterface: APIInterface) {
    private val productList = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>>
    get() = productList;
    suspend fun getProducts(){
        val result: Response<List<Product>> = apiInterface.getProducts()
        if(result.isSuccessful && result != null){
            productList.postValue(result.body())
        }
    }
}