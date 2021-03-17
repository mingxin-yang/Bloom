/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.Screen

@Composable
fun LoginScreen(darkTheme: Boolean = isSystemInDarkTheme(), navigateTo: (Screen) -> Unit) {

    Column(modifier = Modifier.fillMaxHeight()) {
        Spacer(modifier = Modifier.height(184.dp))
        Text(
            "Log in with email",
            style = MaterialTheme.typography.h1,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        OutlinedTextField(
            value = "", onValueChange = {},
            placeholder = { Text(text = "Email address") },
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
                .padding(start = 8.dp, end = 8.dp),
            textStyle = MaterialTheme.typography.body1
        )
        OutlinedTextField(
            value = "", onValueChange = {},
            placeholder = { Text(text = "Password(8+ characters)") },
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
                .padding(start = 8.dp, end = 8.dp),
            textStyle = MaterialTheme.typography.body1
        )
        Text(
            "By clicking below, you agree to our Terms of Use and consent \n to our Privacy Policy.",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 24.dp, bottom = 16.dp),
            style = MaterialTheme.typography.body2
        )
        Button(
            onClick = { navigateTo(Screen.Home) },
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
                .height(60.dp)
                .padding(start = 10.dp, end = 10.dp)
                .clip(MaterialTheme.shapes.medium),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = MaterialTheme.colors.secondary
            )
        ) {
            Text(text = "Log in", style = MaterialTheme.typography.button)
        }
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
fun LoginScreenLight() {
    LoginScreen(false) {}
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
fun LoginScreenDark() {
    LoginScreen(true) {}
}
