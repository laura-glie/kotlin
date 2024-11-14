package com.example.agendadeeventos.view

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.agendadeeventos.model.entities.Evento

@Composable
fun EventoListScreen(eventos: List<Evento>, onAddEventClick: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize()) {
        Button(
            onClick = onAddEventClick,
            modifier = Modifier.padding(16.dp)
        ) {
            Text("Adicionar Evento")
        }
        LazyColumn {
            items(eventos) { evento ->
                EventoItem(evento)
            }
        }
    }
}

@Composable
fun EventoItem(evento: Evento) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Nome: ${evento.nome}")
            Text(text = "Descrição: ${evento.descricao}")
            Text(text = "Data: ${evento.data}")
            Text(text = "Local: ${evento.local}")
        }
    }
}
