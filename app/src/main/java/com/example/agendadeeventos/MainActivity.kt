// MainActivity.kt
package com.example.agendadeeventos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import com.example.agendadeeventos.model.entities.Evento
import com.example.agendadeeventos.model.entities.Participante
import com.example.agendadeeventos.view.AddEventoScreen
import com.example.agendadeeventos.view.AddParticipanteScreen
import com.example.agendadeeventos.view.EventoListScreen
import com.example.agendadeeventos.view.ParticipanteListScreen

class MainActivity : ComponentActivity() {
    private val eventos = mutableStateListOf<Evento>()
    private val participantes = mutableStateListOf<Participante>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var showAddEventScreen by remember { mutableStateOf(false) }
            var showAddParticipanteScreen by remember { mutableStateOf(false) }
            var showEventoListScreen by remember { mutableStateOf(true) }

            when {
                showAddEventScreen -> {
                    AddEventoScreen { evento ->
                        eventos.add(evento)
                        showAddEventScreen = false
                        showEventoListScreen = true
                    }
                }
                showAddParticipanteScreen -> {
                    AddParticipanteScreen { participante ->
                        participantes.add(participante)
                        showAddParticipanteScreen = false
                        showEventoListScreen = false
                    }
                }
                showEventoListScreen -> {
                    EventoListScreen(
                        eventos = eventos,
                        onAddEventClick = { showAddEventScreen = true }
                    )
                }
                else -> {
                    ParticipanteListScreen(
                        participantes = participantes,
                        onAddParticipanteClick = { showAddParticipanteScreen = true }
                    )
                }
            }
        }
    }
}
