package com.kashonkov.avangard_compose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.kashonkov.avangard_compose.feature.auth.ui.login.LoginPage
import com.kashonkov.avangard_compose.feature.auth.ui.login.LoginViewModel
import com.kashonkov.avangard_compose.feature.auth.ui.main.MainPage
import com.kashonkov.avangard_compose.feature.auth.ui.main.MainViewModel

@Composable()
fun MainNavHost(navController: NavHostController, modifier: Modifier){
    NavHost(navController = navController, startDestination = AvangardScreen.Login.name, modifier = modifier){
        composable(AvangardScreen.Login.name){ backStackEntry ->
                val loginViewModel = hiltViewModel<LoginViewModel>()
            LoginPage(loginViewModel){navController.navigate(AvangardScreen.Main.name)} }
        composable(AvangardScreen.Main.name){ backStackEntry ->
            val mainViewModel = hiltViewModel<MainViewModel>()
            MainPage(mainViewModel)
        }
    }
}