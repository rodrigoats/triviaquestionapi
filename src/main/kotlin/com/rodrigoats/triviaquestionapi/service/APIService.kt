package com.rodrigoats.triviaquestionapi.service

import com.rodrigoats.triviaquestionapi.model.entities.Answer
import com.rodrigoats.triviaquestionapi.model.entities.Question
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class APIService {
    fun getQuestions(): Flux<Question> {
        return Flux.just(Question(id = "1", desc = "", answers = listOf(Answer(id = "1", desc = "", correct = true)), category = "a", difficulty = "e"));
    }
}