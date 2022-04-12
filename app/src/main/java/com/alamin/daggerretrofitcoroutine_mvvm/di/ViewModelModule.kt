package com.alamin.daggerretrofitcoroutine_mvvm.di

import androidx.lifecycle.ViewModel
import com.alamin.daggerretrofitcoroutine_mvvm.view_model.ProductViewModel
import com.alamin.daggerretrofitcoroutine_mvvm.view_model.ProductViewModel2
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
abstract class ViewModelModule {

    @Binds
    @ClassKey(ProductViewModel::class)
    @IntoMap
    abstract fun provideViewModel(productViewModel: ProductViewModel): ViewModel

    @Binds
    @ClassKey(ProductViewModel2::class)
    @IntoMap
    abstract fun provideViewModel2(productViewModel2: ProductViewModel2): ViewModel

}