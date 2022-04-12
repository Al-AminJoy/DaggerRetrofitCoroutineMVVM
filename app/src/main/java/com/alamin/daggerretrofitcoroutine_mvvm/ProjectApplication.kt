package com.alamin.daggerretrofitcoroutine_mvvm

import android.app.Application
import com.alamin.daggerretrofitcoroutine_mvvm.di.ApplicationComponent
import com.alamin.daggerretrofitcoroutine_mvvm.di.DaggerApplicationComponent

class ProjectApplication : Application(){
    lateinit var applicationComponent: ApplicationComponent;
    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.factory().create(this);
    }

}