package org.liveCommuteApi.controller

import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Tag(name = "Health Check")
@RestController
class HealthCheck(
    private val jdbcTemplate: JdbcTemplate
) {
    @GetMapping("/v1/healthcheck")
    @ApiResponse(
        responseCode = "204",
        description = "Success",
        content = [Content()]
    )
    @ApiResponse(
        responseCode = "500",
        description = "Failed",
        content = [Content()]
    )
    fun index(): ResponseEntity<Any> {
        jdbcTemplate.execute("SELECT 1")
        return ResponseEntity(HttpStatus.NO_CONTENT)
    }
}