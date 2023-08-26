package com.example.connect.Viewmodel_packages


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.connect.MarsSpace
import com.example.connect.UseCases.MarsUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MarsViewModel @Inject constructor(val usecase: MarsUseCases): ViewModel() {

   private val _lands = MutableStateFlow(emptyList<MarsSpace>())
    val lands:StateFlow<List<MarsSpace>> get() = _lands



    fun getlands(){

        viewModelScope.launch {
            try {
                val mar_lands = usecase()
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