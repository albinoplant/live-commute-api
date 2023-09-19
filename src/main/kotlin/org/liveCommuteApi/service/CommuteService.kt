package org.liveCommuteApi.service

import org.liveCommuteApi.client.model.Stop
import org.liveCommuteApi.client.model.Vehicle
import org.liveCommuteApi.repository.ICommuteRepository
import org.springframework.stereotype.Service

@Service
class CommuteService(
    private val repository: ICommuteRepository
) :ICommuteService{
    override fun getStops(): Collection<Stop> {
       return repository.getStops()
    }

    override fun getStop(id: Int): Stop? {
        return repository.getStop(id)
    }

    override fun getVehicles(): Collection<Vehicle> {
        return repository.getVehicles()
    }

    override fun getVehicleOfLine(id: Int): Collection<Vehicle> {
        return repository.getVehicleOfLine(id)
    }
}