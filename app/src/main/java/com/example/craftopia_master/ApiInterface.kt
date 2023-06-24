package com.example.craftopia_master

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("/dvuz0jdzl/raw/upload/v1687538321/Craftopia/databasejson/database_v5sprd.json")
    fun getData(): Call<responseDataClass>
}
