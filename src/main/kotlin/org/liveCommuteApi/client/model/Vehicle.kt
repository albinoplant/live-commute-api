package org.liveCommuteApi.client.model

import com.fasterxml.jackson.annotation.JsonProperty


data class Vehicle(
    @JsonProperty("line_id") val lineId: Int,
    @JsonProperty("line_number") val lineNumber: String,
    @JsonProperty("line_type") val lineType: String,
    @JsonProperty("line_subtype") val lineSubtype: String,
    @JsonProperty("vehicle_type") val vehicleType: String,
    @JsonProperty("vehicle_id") val vehicleId: Int,
    @JsonProperty("vehicle_number") val vehicleNumber: String,
    @JsonProperty("route_variant_number") val routeVariantNumber: Int,
    @JsonProperty("service") val service: String,
    @JsonProperty("direction") val direction: String,
    @JsonProperty("previous_stop") val previousStop: String,
    @JsonProperty("next_stop") val nextStop: String,
    @JsonProperty("latitude") val latitude: Double,
    @JsonProperty("longitude") val longitude: Double,
    @JsonProperty("velocity") val velocity: Int,
    @JsonProperty("punctuality") val punctuality: Int,
    @JsonProperty("updated_at") val updatedAt: String
)