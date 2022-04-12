package com.alamin.daggerretrofitcoroutine_mvvm.model.local.Dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.alamin.daggerretrofitcoroutine_mvvm.model.data.Product

@Dao
interface ProductDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addProducts(prducts: List<Product>)

    @Query("SELECT * FROM Product")
    fun getAllProducts(): LiveData<List<Product>>
}