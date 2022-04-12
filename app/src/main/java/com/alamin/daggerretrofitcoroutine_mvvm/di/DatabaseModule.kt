package com.alamin.daggerretrofitcoroutine_mvvm.di

import android.content.Context
import androidx.room.Room
import com.alamin.daggerretrofitcoroutine_mvvm.model.local.LocalDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideLocalDatabase(context: Context): LocalDatabase{
        return Room.databaseBuilder(
            context.applicationContext,
            LocalDatabase::class.java,
            "local_database")
            .build();
    }

}