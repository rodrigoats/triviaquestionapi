package com.rodrigoats.triviaquestionapi.config

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.config.CorsRegistry
import org.springframework.web.reactive.config.EnableWebFlux
import org.springframework.web.reactive.config.WebFluxConfigurer

@Configuration
@EnableWebFlux
@ComponentScan("com.rodrigoats.triviaquestionapi")
class WebConfig: WebFluxConfigurer{
    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("apt/**")
    }
}