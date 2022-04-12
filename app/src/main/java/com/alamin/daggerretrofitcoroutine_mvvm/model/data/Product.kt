package com.alamin.daggerretrofitcoroutine_mvvm.model.data


import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
@Entity
@Parcelize
data class Product(
    @PrimaryKey(autoGenerate = true)
    @SerializedName("id")
    val id: Int,
    @SerializedName("category")
    val category: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("price")
    val price: Double,
    @SerializedName("title")
    val title: String
): Parcelable