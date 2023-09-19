package org.liveCommuteApi.configuration

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableWebSecurity
class SecurityConfiguration {
    @Value("\${app.api-key}")
    private lateinit var apiKey: String

    @Bean
    fun filterChain(httpSecurity: HttpSecurity): SecurityFilterChain? {
        httpSecurity
            .csrf().disable()

        return httpSecurity.build()
    }
}