package org.liveCommuteApi.service

import org.liveCommuteApi.client.model.Stop
import org.liveCommuteApi.client.model.Vehicle

interface ICommuteService {
    fun getStops(): Collection<Stop>
    fun getStop(id: Int): Stop?
    fun getVehicles(): Collection<Vehicle>
    fun getVehicleOfLine(id: Int): Collection<Vehicle>
}