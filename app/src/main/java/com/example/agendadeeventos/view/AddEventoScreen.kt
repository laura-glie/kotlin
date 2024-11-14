package com.example.agendadeeventos.view

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.material3.TextField
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.agendadeeventos.model.entities.Evento

@Composable
fun AddEventoScreen(onSave: (Evento) -> Unit) {
    var nome by remember { mutableStateOf("") }
    var descricao by remember { mutableStateOf("") }
    var data by remember { mutableStateOf("") }
    var local by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = nome,
            onValueChange = { nome = it },
            label = { Text("Nome do Evento") }
        )
        Spacer(modifier = Modifier.height(8.dp))
        TextField(
            value = descricao,
            onValueChange = { descricao = it },
            label = { Text("Descrição") }
        )
        Spacer(modifier = Modifier.height(8.dp))
        TextField(
            value = data,
            onValueChange = { data = it },
            label = { Text("Data") }
        )
        Spacer(modifier = Modifier.height(8.dp))
        TextField(
            value = local,
            onValueChange = { local = it },
            label = { Text("Local") }
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            onSave(Evento(0, nome, descricao, data, local))
        }) {
            Text("Salvar Evento")
        }
    }
}
