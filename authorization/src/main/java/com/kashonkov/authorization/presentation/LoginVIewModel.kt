package com.kashonkov.avangard_compose.feature.auth.ui.login

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import ru.avangard.ib.api.client
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(): ViewModel() {
    var currentState by mutableStateOf(LoginState.initial)
    private set

    fun onLoginChanged(login: String) {
        currentState = currentState.copy(login = login)
    }

    fun onPasswordChange(password: String) {
        currentState = currentState.copy(password = password)
    }

}