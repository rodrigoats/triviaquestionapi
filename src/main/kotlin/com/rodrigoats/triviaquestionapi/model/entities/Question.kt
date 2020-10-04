package com.rodrigoats.triviaquestionapi.model.entities

data class Question (
        val id: String,
        val desc: String,
        val answers: List<Answer>,
        val category: String,
        val difficulty: String
)