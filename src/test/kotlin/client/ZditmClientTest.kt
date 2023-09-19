package org.liveCommuteApi.client

import org.junit.jupiter.api.Test

class ZditmClientTest {
    private val client = ZditmClient()
    @Test
    fun getVehicles() {
        val response = client.getVehicles()
    }

    @Test
    fun getVehicle() {
        val response = client.getVehicleOfLine(1)
    }
}