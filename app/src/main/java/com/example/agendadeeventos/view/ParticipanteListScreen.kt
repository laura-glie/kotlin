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
import com.example.agendadeeventos.model.entities.Participante

@Composable
fun ParticipanteListScreen(participantes: List<Participante>, onAddParticipanteClick: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize()) {
        Button(
            onClick = onAddParticipanteClick,
            modifier = Modifier.padding(16.dp)
        ) {
            Text("Adicionar Participante")
        }
        LazyColumn {
            items(participantes) { participante ->
                ParticipanteItem(participante)
            }
        }
    }
}

@Composable
fun ParticipanteItem(participante: Participante) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Nome: ${participante.nome}")
            Text(text = "E-mail: ${participante.email}")
        }
    }
}

