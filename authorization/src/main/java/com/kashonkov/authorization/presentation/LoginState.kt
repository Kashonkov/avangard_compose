package com.kashonkov.avangard_compose.feature.auth.ui.login

data class LoginState(
    val login: String? = null,
    val password: String? = null,
) {
    companion object{
        val initial = LoginState()
    }
}