package com.kashonkov.avangard_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.kashonkov.avangard_compose.feature.auth.ui.login.LoginViewModel
import com.kashonkov.avangard_compose.navigation.MainNavHost
import com.kashonkov.avangard_compose.ui.theme.Avangard_composeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    lateinit var navigator: NavHostController
    val loginViewModel by viewModels<LoginViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Avangard_composeTheme {
                navigator = rememberNavController();
                MainNavHost(navController = navigator, modifier = Modifier)
            }
        }
    }
}