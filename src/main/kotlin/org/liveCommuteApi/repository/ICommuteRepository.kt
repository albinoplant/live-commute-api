package org.liveCommuteApi.repository

import org.liveCommuteApi.client.model.Stop
import org.liveCommuteApi.client.model.Vehicle

interface ICommuteRepository {
    fun getStops(): Collection<Stop>
    fun getVehicles(): Collection<Vehicle>
    fun getVehicleOfLine(id: Int): Collection<Vehicle>
    fun getStop(id: Int): Stop?
}