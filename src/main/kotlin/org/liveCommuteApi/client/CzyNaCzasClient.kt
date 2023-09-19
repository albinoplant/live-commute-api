package org.liveCommuteApi.client

import com.fasterxml.jackson.databind.ObjectMapper
import org.liveCommuteApi.client.model.Stop
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

import org.springframework.web.client.RestTemplate

@Component
class CzyNaCzasClient {
    private val baseUrl: String = "https://czynaczas.pl/api"
    private val routePrefix: String = "/szczecin"
    @Autowired
    private lateinit var mapper: ObjectMapper
    private val template = RestTemplate()

    fun getStops(): List<Stop> {
        val response = template.getForObject("$baseUrl$routePrefix/stops", String::class.java)
        val stops = mapper.readValue(response, List::class.java)
        return stops as List<Stop>
    }
}