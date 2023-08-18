package org.liveCommuteApi

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@OpenAPIDefinition(
    info = Info(
        title="Live Commute API",
        description = "",
        version = "\${applicationVersion}"
    )
)
class LiveCommuteApiApplication

fun main(args: Array<String>) {
    runApplication<LiveCommuteApiApplication>(*args)
}