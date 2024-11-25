package com.example.flo_clone.look.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LookViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is look Fragment"
    }
    val text: LiveData<String> = _text
}