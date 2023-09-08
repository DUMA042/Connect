package com.example.connect.RetrofitSetup

import com.example.connect.MarLands
import retrofit2.http.GET

interface MarsApi {
    @GET("realestate")
    suspend fun getProperties():
           List<MarLands>
}

