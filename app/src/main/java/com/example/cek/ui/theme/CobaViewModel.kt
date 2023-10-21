package com.example.cek.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.cek.Data.DataForm
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel : ViewModel () {
    var namaUsr : String by mutableStateOf("")
        private set
    var noTlp : String by mutableStateOf("")
        private set
    var jenisKL : String by mutableStateOf("")
        private set
    private val _uiState = MutableStateFlow(DataForm())
    val uiState : StateFlow<DataForm> = _uiState.asStateFlow()

    fun BacaData(nm:String,tlp:String,jk:String) {
        namaUsr = nm;
        noTlp = tlp;
        jenisKL = jk;
    }

    fun setJk(pilihJk:String){
        _uiState.update { iniState -> iniState.copy(gender = jenisKL) }
    }
}