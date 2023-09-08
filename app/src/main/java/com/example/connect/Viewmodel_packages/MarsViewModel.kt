package com.example.connect.Viewmodel_packages


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.connect.MarLands
import com.example.connect.Repositories.MarsNetworkRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MarsViewModel @Inject constructor(val marsRep: MarsNetworkRepository): ViewModel() {

   private val _lands = MutableStateFlow(emptyList<MarLands>())
    val lands:StateFlow<List<MarLands>> get() = _lands

init {
    getlands()
}

    fun getlands(){

        viewModelScope.launch {
            try {
                val mar_lands = marsRep.getMarsLands()
                _lands.value=mar_lands

            }catch (_: Exception){

            }

        }
    }

/*
    private val postStateFlow: Flow<List<MarLands>?> = flow {
        emit(marsRep.getMarsLands().body())
    }.flowOn(Dispatchers.IO)


    val _postStateFlow: Flow<List<MarLands>?> = postStateFlow
    */


}