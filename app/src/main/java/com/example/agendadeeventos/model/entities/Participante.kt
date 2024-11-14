package com.example.agendadeeventos.model.entities

data class Participante(
    val id: Int, // Quando usar o Room, esse campo será anotado com @PrimaryKey
    val nome: String,
    val email: String
)
