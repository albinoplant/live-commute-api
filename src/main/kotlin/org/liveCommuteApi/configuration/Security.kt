package org.liveCommuteApi.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.web.SecurityFilterChain

@Configuration
class Security {
    @Bean
    fun filterChain(httpSecurity: HttpSecurity): SecurityFilterChain? {
        httpSecurity
            .csrf().disable()
            .authorizeRequests()
            .antMatchers("/v1/healthcheck").permitAll()
            .antMatchers("/css/**", "/js/**", "/img/**", "/lib/**", "/actuator/**").permitAll()
            .antMatchers("/favicon.ico", "/swagger-ui/**", "/swagger-ui.html").permitAll()

        return httpSecurity.build()
    }
}