package com.molloyruaidhri.flows

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

    private var _liveData: MutableLiveData<String> = MutableLiveData("Hello World")
    val liveData: LiveData<String> = _liveData

    private var _stateFlow: MutableStateFlow<String> = MutableStateFlow("Hello World")
    val stateFlow: StateFlow<String> = _stateFlow

    private var _sharedFlow = MutableSharedFlow<String>()
    val sharedFlow: SharedFlow<String> = _sharedFlow

    // survives config change
    fun triggerLiveData() {
        _liveData.value = "Live Data"
    }

    // survives config change
    fun triggerStateFlow() {
        _stateFlow.value = "State Flow"
    }

    // survives config change but only emitted once even if config change
    // good for snackbar notification say
    fun triggerSharedFlow() {
        viewModelScope.launch {
            _sharedFlow.emit("Shared Flow")
        }
    }

    // doesn't survive config change
    fun triggerFlow(): Flow<String> {
        return flow {
            repeat(3) {
                emit(it.toString())
                delay(1000L)
            }
        }
    }
}