package com.kashonkov.avangard_compose.ui.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Composable
fun TopRoundedContainer(modifier: Modifier = Modifier, child: @Composable (() -> Unit)? = null){
    return Box(modifier = modifier
        .clip(shape = RoundedCornerShape(16.dp))
        .background(color = MaterialTheme.colors.surface)
        .fillMaxSize()){
        child?.invoke()
    }
}