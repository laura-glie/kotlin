package com.example.agendadeeventos.view

import androidx.compose.foundation.layout.*
import androidx.compose.material3.TextField
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.agendadeeventos.model.entities.Participante

@Composable
fun AddParticipanteScreen(onSave: (Participante) -> Unit) {
    var nome by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = nome,
            onValueChange = { nome = it },
            label = { Text("Nome do Participante") }
        )
        Spacer(modifier = Modifier.height(8.dp))
        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("E-mail") }
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            onSave(Participante(0, nome, email))
        }) {
            Text("Salvar Participante")
        }
    }
}
