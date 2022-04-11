package com.alamin.daggerretrofitcoroutine_mvvm.view_model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.alamin.daggerretrofitcoroutine_mvvm.model.repository.ProductRepository
import javax.inject.Inject

class ViewModelFactory @Inject constructor(private val repository: ProductRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ProductViewModel(repository) as T
    }
}