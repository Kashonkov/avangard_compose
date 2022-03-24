package com.kashonkov.avangard_compose.ui.compose

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun AvangardTextField(modifier: Modifier = Modifier,
                      label: String? = null,
                      value: String = "",
                      onValueChange: (String) -> Unit,
                      trailingIcon: @Composable (() -> Unit)? = null) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        colors = TextFieldDefaults.textFieldColors(
            textColor = MaterialTheme.colors.onSurface,
            backgroundColor = MaterialTheme.colors.surface,
            cursorColor = MaterialTheme.colors.primary,
        ),
        trailingIcon = trailingIcon,
        label = if (label != null) {
            {
                Text(text = label)  }
        } else null,
    )
}
