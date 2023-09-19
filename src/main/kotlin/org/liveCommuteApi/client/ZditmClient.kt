package org.liveCommuteApi.client

import org.liveCommuteApi.client.model.Vehicle
import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.HttpMethod
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

@Component
class ZditmClient {
    private val baseUrl = "https://www.zditm.szczecin.pl"
    private val routePrefix = "/pl/passenger/maps"
    private val template: RestTemplate = RestTemplate()

    fun getVehicles(): List<Vehicle> {
        val responseType = object : ParameterizedTypeReference<List<Vehicle>>() {}
        val response = template.exchange("$baseUrl$routePrefix/vehicles", HttpMethod.POST, null, responseType)
        return response.body ?: emptyList()
    }

    fun getVehicleOfLine(id: Int): List<Vehicle> {
        val responseType = object : ParameterizedTypeReference<List<Vehicle>>() {}
        val response = template.exchange("$baseUrl$routePrefix/vehicles/$id", HttpMethod.POST, null, responseType)
        return response.body ?: emptyList()
    }
}