package com.alamin.daggerretrofitcoroutine_mvvm.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alamin.daggerretrofitcoroutine_mvvm.model.data.Product
import com.alamin.daggerretrofitcoroutine_mvvm.model.repository.ProductRepository
import kotlinx.coroutines.launch

class ProductViewModel(private val repository: ProductRepository): ViewModel() {

    val products : LiveData<List<Product>>
    get() = repository.products;

    init {
        viewModelScope.launch {
            repository.getProducts();
        }
    }

}