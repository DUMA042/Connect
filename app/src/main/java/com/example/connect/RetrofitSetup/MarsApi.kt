package com.example.connect.RetrofitSetup

import com.example.connect.MarLands
import retrofit2.Response
import retrofit2.http.GET

interface MarsApi {
    @GET("realestate")
    fun getProperties():
           Response<List<MarLands>>
}

