package com.example.formpageapp.Data

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class Cobaviewmodel:ViewModel() {
    var namaUsr : String by mutableStateOf("") //revised
        private set
    var noTlp : String by mutableStateOf("")
        private set
    var jenisKl : String by mutableStateOf("")
        private set
    var alamat : String by  mutableStateOf("")
        private set
    var email : String by mutableStateOf("")
        private set
    private val _uiState = MutableStateFlow(DataForm())
    val uiState: StateFlow<DataForm> = _uiState.asStateFlow()

    fun BacaData(nm: String, tlp: String, jk: String, al: String, eml: String){
        namaUsr=nm;
        noTlp=tlp;
        jenisKl=jk;
        alamat= al;
        email = eml;
    }

    fun setJenis(pilihJK:String) =
        _uiState.update { currentState -> currentState.copy(sex= pilihJK) }


    }

