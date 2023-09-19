package org.liveCommuteApi.client

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class CzyNaCzasClientTest {
    @Autowired
    private lateinit var client: CzyNaCzasClient

    @Test
    fun getStops() {
        val response = client.getStops()
    }
}