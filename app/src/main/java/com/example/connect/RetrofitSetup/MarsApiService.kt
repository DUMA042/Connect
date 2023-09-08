package com.example.connect.RetrofitSetup

import com.example.connect.MarLands
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

import javax.inject.Inject

class MarsApiService  @Inject constructor(private val marsApi: MarsApi) {

    suspend fun getProperties(): List<MarLands> {

           return  marsApi.getProperties()
    }

}
