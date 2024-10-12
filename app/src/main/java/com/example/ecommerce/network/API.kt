package com.example.ecommerce.network

import com.example.ecommerce.Model.ItemModel
import com.example.ecommerce.Model.SliderModel
import retrofit2.http.GET
import retrofit2.Call

interface API {
    @GET("api/products")
    fun getProducts(): Call<MutableList<ItemModel>>

    @GET("/api/carousels")
    fun getBanners(): Call<MutableList<SliderModel>>
}