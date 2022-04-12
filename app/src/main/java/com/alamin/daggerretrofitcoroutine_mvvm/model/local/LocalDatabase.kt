package com.alamin.daggerretrofitcoroutine_mvvm.model.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.alamin.daggerretrofitcoroutine_mvvm.model.data.Product
import com.alamin.daggerretrofitcoroutine_mvvm.model.local.Dao.ProductDao

@Database(entities = [Product::class], version = 1, exportSchema = false)
abstract class LocalDatabase : RoomDatabase(){
    abstract fun productDao(): ProductDao;
}