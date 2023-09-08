package com.example.connect.Repositories

import com.example.connect.MarsSpace
import com.example.connect.RetrofitSetup.MarsApi
import com.example.connect.RetrofitSetup.MarsApiService
import com.example.connect.toMarsSpace

import javax.inject.Inject

class MarsNetworkRepository @Inject
constructor(private val marsApi: MarsApi) {

    suspend fun getMarsLands()=marsApi.getProperties()



    /*
    fun getMarsLands(): Flow<Response<MutableList<MarLands>>> = flow {
        emit(marsAPIService.getProperties())
    }.flowOn(Dispatchers.IO)*/
}
