package org.liveCommuteApi.repository

import org.liveCommuteApi.client.CzyNaCzasClient
import org.liveCommuteApi.client.ZditmClient
import org.liveCommuteApi.client.model.Stop
import org.liveCommuteApi.client.model.Vehicle
import org.springframework.stereotype.Component

@Component
class CommuteRepository(
    private val czyNaCzasClient: CzyNaCzasClient,
    private val zditmClient: ZditmClient
): ICommuteRepository {
    override fun getStops(): Collection<Stop> {
       return czyNaCzasClient.getStops()
    }

    override fun getVehicles(): Collection<Vehicle> {
        return zditmClient.getVehicles()
    }

    override fun getVehicleOfLine(id: Int): Collection<Vehicle> {
        return zditmClient.getVehicleOfLine(id)
    }

    override fun getStop(id: Int): Stop? {
        TODO("Not yet implemented")
    }
}