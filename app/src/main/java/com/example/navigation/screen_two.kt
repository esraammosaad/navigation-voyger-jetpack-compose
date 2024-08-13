package com.example.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen

class ScreenTwo (val user:User):Screen{
    @Composable
    override fun Content() {
        Column (Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
            Text(text = "User Data", fontSize = 32.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "username : ${user.name}", fontSize = 24.sp)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "email : ${user.email}", fontSize = 24.sp)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "password : ${user.password}", fontSize = 24.sp)

        }
    }


}