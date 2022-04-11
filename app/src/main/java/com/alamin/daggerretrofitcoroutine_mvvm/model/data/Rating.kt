package com.alamin.daggerretrofitcoroutine_mvvm.model.data


import com.google.gson.annotations.SerializedName

data class Rating(
    @SerializedName("count")
    val count: Int,
    @SerializedName("rate")
    val rate: Double
)