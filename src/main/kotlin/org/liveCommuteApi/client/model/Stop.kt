package org.liveCommuteApi.client.model

import com.fasterxml.jackson.annotation.JsonProperty

data class Stop(
    @JsonProperty("id") val id: String,
    @JsonProperty("name") val name: String,
    @JsonProperty("latitude") val latitude: String,
    @JsonProperty("longitude") val longitude: String
)