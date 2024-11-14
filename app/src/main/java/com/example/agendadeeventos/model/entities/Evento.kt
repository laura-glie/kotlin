package com.example.agendadeeventos.model.entities

data class Evento(
    val id: Int, // Quando usar o Room, esse campo será anotado com @PrimaryKey
    val nome: String,
    val descricao: String,
    val data: String, // Para simplificar, usando String para a data
    val local: String
)
