package com.kashonkov.avangard_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.kashonkov.avangard_compose.feature.auth.ui.LoginPage
import com.kashonkov.avangard_compose.ui.theme.Avangard_composeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Avangard_composeTheme {
                LoginPage()
            }
        }
    }
}