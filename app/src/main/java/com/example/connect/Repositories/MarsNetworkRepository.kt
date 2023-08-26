package com.example.connect.Repositories

import com.example.connect.MarsSpace
import com.example.connect.RetrofitSetup.MarsApiService
import com.example.connect.toMarsSpace

import javax.inject.Inject

class MarsNetworkRepository @Inject
constructor(private val marsAPIService: MarsApiService) {

    suspend fun getMarsLands()=marsAPIService.getProperties()

    suspend fun getGames(): List<MarsSpace> {

        return marsAPIService.getProperties().map {
            it.toMarsSpace()
        }

    }

    /*
    fun getMarsLands(): Flow<Response<MutableList<MarLands>>> = flow {
        emit(marsAPIService.getProperties())
    }.flowOn(Dispatchers.IO)*/
}
