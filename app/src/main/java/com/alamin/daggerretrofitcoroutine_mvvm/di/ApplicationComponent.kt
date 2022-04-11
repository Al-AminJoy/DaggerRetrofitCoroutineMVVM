package com.alamin.daggerretrofitcoroutine_mvvm.di

import com.alamin.daggerretrofitcoroutine_mvvm.view.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)

}