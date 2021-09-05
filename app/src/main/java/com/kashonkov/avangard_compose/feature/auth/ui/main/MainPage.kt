package com.kashonkov.avangard_compose.feature.auth.ui.main

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import com.kashonkov.avangard_compose.ui.compose.TopRoundedContainer

@Composable
fun MainPage(viewModel: MainViewModel) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Main screen")
                },
                backgroundColor = MaterialTheme.colors.background,
            )
        },
    )
    {
        TopRoundedContainer() {}
    }
}