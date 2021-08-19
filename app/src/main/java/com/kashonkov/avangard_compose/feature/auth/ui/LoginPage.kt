package com.kashonkov.avangard_compose.feature.auth.ui

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.kashonkov.avangard_compose.R
import com.kashonkov.avangard_compose.ui.compose.AvangardTextField
import com.kashonkov.avangard_compose.ui.compose.TopRoundedContainer
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Composable
fun LoginPage() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Image(
                        painterResource(id = R.drawable.avangard), contentDescription = "", modifier = Modifier
                            .padding(start = 44.dp, end = 20.dp, top = 20.dp, bottom = 20.dp)
                    )
                },
                navigationIcon = {
                    IconButton(onClick = {}, content = {
                        Icon(Icons.Filled.Phone, contentDescription = "")
                    })
                },
                backgroundColor = MaterialTheme.colors.background,
                elevation = 0.dp
            )
        },
    )
    {
        TopRoundedContainer() {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Top, modifier = Modifier
                    .fillMaxSize()
                    .padding(vertical = 46.dp)
            ) {
                val modifier = Modifier.padding(horizontal = 40.dp)

                var login by remember {
                    mutableStateOf("")
                }

                AvangardTextField(
                    value = login, onValueChange = {login = it}, modifier = modifier
                        .padding(top = 6.dp)
                        .fillMaxWidth(), label = stringResource(id = R.string.login)
                )

                val password = remember {
                    mutableStateOf("")
                }

                AvangardTextField(
                    value = password.value, onValueChange = {password.value = it},
                    modifier = modifier
                        .padding(top = 56.dp)
                        .fillMaxWidth(),
                    label = stringResource(id = R.string.password),
                    trailingIcon = {
                        IconButton(onClick = { Log.i("myLog", "olololo") }) {
                            Icon(painter = painterResource(id = R.drawable.ic_show_on), contentDescription = "", tint = MaterialTheme.colors.primary)
                        }
                    },
                )

                Row(modifier = modifier.padding(top = 44.dp)) {
                    OutlinedButton(
                        onClick = { Log.i("myLog", "olololo") }, modifier = Modifier.weight(1f), border = BorderStroke(
                            ButtonDefaults.OutlinedBorderSize, MaterialTheme.colors.primary
                        )
                    ) {
                        Text(text = stringResource(id = R.string.log_in).uppercase())
                    }

                    OutlinedButton(
                        onClick = { Log.i("myLog", "olololo") }, modifier = Modifier
                            .padding(start = 20.dp)
                            .height(36.dp)
                            .width(40.dp), border = BorderStroke(
                            ButtonDefaults.OutlinedBorderSize, MaterialTheme.colors.primary
                        ),
                        contentPadding = PaddingValues()
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_biometry), contentDescription = "", modifier = Modifier
                                .height(20.dp)
                                .width(18.dp)
                        )
                    }
                }

                Spacer(modifier = modifier.weight(1f))

                Row(
                    horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 18.dp)
                ) {
                    BottomMenuItem(id = R.drawable.ic_discount, stringRes = R.string.discount)
                    BottomMenuItem(id = R.drawable.ic_addresses, stringRes = R.string.addresses)
                    BottomMenuItem(id = R.drawable.ic_qr_pay, stringRes = R.string.ar_pay)

                }
            }
        }
    }

}

@Composable
fun BottomMenuItem(id: Int, stringRes: Int) {
    return Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.clickable { }) {
        Image(
            painterResource(id = id), contentDescription = "", modifier = Modifier
                .width(40.dp)
                .height(40.dp)
        )
        CompositionLocalProvider(LocalTextStyle.provides(MaterialTheme.typography.caption.copy(color = MaterialTheme.colors.onSurface))) {
            Text(text = stringResource(id = stringRes), modifier = Modifier.width(108.dp), textAlign = TextAlign.Center)
        }
    }
}