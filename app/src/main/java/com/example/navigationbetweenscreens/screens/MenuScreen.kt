package com.example.navigationbetweenscreens.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun MenuScreen(modifier: Modifier = Modifier, navController: NavController) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF0078D4))
            .padding(32.dp)
    ) {
        Column(
            modifier = Modifier.align(Alignment.Center),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "MENU",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Button(
                onClick = { navController.navigate("perfil/Fulano de Tal/27") },
                colors = ButtonDefaults.buttonColors(Color.White),
                modifier = Modifier.padding(8.dp)
            ) {
                Text("Perfil", color = Color.Blue, fontSize = 16.sp)
            }
            Button(
                onClick = { navController.navigate("pedidos?cliente=Cliente XPTO") },
                colors = ButtonDefaults.buttonColors(Color.White),
                modifier = Modifier.padding(8.dp)
            ) {
                Text("Pedidos", color = Color.Blue, fontSize = 16.sp)
            }
            Button(
                onClick = { navController.navigate("login") },
                colors = ButtonDefaults.buttonColors(Color.Red),
                modifier = Modifier.padding(8.dp)
            ) {
                Text("Sair", color = Color.White, fontSize = 16.sp)
            }
        }
    }
}
