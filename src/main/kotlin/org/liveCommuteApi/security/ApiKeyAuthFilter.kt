package org.liveCommuteApi.security

import org.springframework.http.HttpStatus
import org.springframework.web.filter.OncePerRequestFilter
import javax.servlet.FilterChain
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class ApiKeyAuthFilter(private val apiKey: String) : OncePerRequestFilter() {

    override fun doFilterInternal(
        request: HttpServletRequest,
        response: HttpServletResponse,
        filterChain: FilterChain
    ) {
        val requestApiKey = request.getHeader("X-API-KEY")

        if (requestApiKey == null || requestApiKey != apiKey) {
            response.status = HttpStatus.UNAUTHORIZED.value()
            return
        }

        filterChain.doFilter(request, response)
    }
}