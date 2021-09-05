package com.kashonkov.avangard_compose.feature.auth.ui.main

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(): ViewModel() {
    override fun onCleared() {
        print("")
        super.onCleared()
    }
}