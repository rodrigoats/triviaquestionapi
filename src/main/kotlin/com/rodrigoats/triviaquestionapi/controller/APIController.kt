package com.rodrigoats.triviaquestionapi.controller

import com.rodrigoats.triviaquestionapi.model.entities.Question
import com.rodrigoats.triviaquestionapi.service.APIService
import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.toMono

@RestController
@RequestMapping(path = ["/api"], produces = [APPLICATION_JSON_VALUE])
class APIController(
        private val apiService: APIService
) {
    fun getData() : Mono<Question> {
        return apiService.getQuestions().toMono();
    }
}