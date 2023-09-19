package org.liveCommuteApi.controller

import com.fasterxml.jackson.databind.ObjectMapper
import io.swagger.v3.oas.annotations.tags.Tag
import org.liveCommuteApi.client.model.Stop
import org.liveCommuteApi.client.model.Vehicle
import org.liveCommuteApi.service.ICommuteService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Tag(name = "Commute")
@RestController
class CommuteController(
    private val service: ICommuteService
) {
    @GetMapping("/v1/commute/stops")
    fun getStops(): Collection<Stop> {
        val stops = service.getStops()
        val stringStops = ObjectMapper().writeValueAsString(stops)
        return stops
    }
    @GetMapping("/v1/commute/stops/{stopId}")
    fun getStop(stopId: Int): Stop? {
        return service.getStop(stopId)
    }
    @GetMapping("/v1/commute/vehicles")
    fun getVehicles(): Collection<Vehicle> {
        return service.getVehicles()
    }
    @GetMapping("/v1/commute/vehicles/{lineId}")
    fun getVehicleOfLine(lineId: Int): Collection<Vehicle> {
        return service.getVehicleOfLine(lineId)
    }

}