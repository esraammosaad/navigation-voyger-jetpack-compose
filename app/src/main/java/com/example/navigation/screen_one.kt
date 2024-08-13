package com.example.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow

class ScreenOne : Screen {
    @Composable
    override fun Content() {

        val name = remember {
            mutableStateOf("")
        }
        val email = remember {
            mutableStateOf("")
        }
        val password = remember {
            mutableStateOf("")
        }
        val navigator= LocalNavigator.currentOrThrow

        Column (Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
            OutlinedTextField(value = name.value, onValueChange = {name.value=it},
                label = {
                Text(text = "Username")
            })
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(value = email.value, onValueChange = {email.value=it},
                label = {
                    Text(text = "Email")}


                    )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(value = password.value, onValueChange = {password.value=it},    label = {
                Text(text = "Password")
            })
            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = { navigator.push(ScreenTwo(User(name = name.value, email = email.value, password = password.value))) }) {

                Text(text = "Go to Screen Two")

            }

        }
    }


}