package org.liveCommuteApi.controller

import io.swagger.v3.oas.annotations.tags.Tag
import org.liveCommuteApi.client.model.Stop
import org.liveCommuteApi.client.model.Vehicle
import org.liveCommuteApi.service.ICommuteService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@Tag(name = "Commute")
@RestController
class CommuteController(
    private val service: ICommuteService
) {
    @GetMapping("/v1/commute/stops")
    fun getStops(): Collection<Stop> {
        return service.getStops()
    }
    @GetMapping("/v1/commute/stops/{stopId}")
    fun getStop(
        @PathVariable stopId: Int
    ): Stop? {
        return service.getStop(stopId)
    }
    @GetMapping("/v1/commute/vehicles")
    fun getVehicles(): Collection<Vehicle> {
        return service.getVehicles()
    }
    @GetMapping("/v1/commute/vehicles/{lineId}")
    fun getVehicleOfLine(
        @PathVariable lineId: Int
    ): Collection<Vehicle> {
        return service.getVehicleOfLine(lineId)
    }

}