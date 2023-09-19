package org.liveCommuteApi

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["org.liveCommuteApi"])
@OpenAPIDefinition(
    info = Info(
        title="Live Commute API",
        description = "",
        version = "\${app.version}"
    )
)
class LiveCommuteApiApplication

fun main(args: Array<String>) {
    runApplication<LiveCommuteApiApplication>(*args)
}