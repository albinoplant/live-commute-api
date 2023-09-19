package org.liveCommuteApi.serialization

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import org.liveCommuteApi.client.model.Stop
import java.io.IOException


class StopsDeserializer :
    StdDeserializer<List<Stop?>?>(MutableList::class.java) {
    @Throws(IOException::class, JsonProcessingException::class)
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): List<Stop> {
        val locations: MutableList<Stop> = ArrayList<Stop>()
        val root = p.codec.readTree<JsonNode>(p)
        for (node in root) {
            val id = node[0].asText()
            val name = node[1].asText()
            val latitude = node[2].asText()
            val longitude = node[3].asText()
            val field1: MutableList<String> = ArrayList()
            val field2: MutableList<Int> = ArrayList()
            val field1Node = node[4]
            for (item in field1Node) {
                field1.add(item.asText())
            }
            val field2Node = node[5]
            for (item in field2Node) {
                field2.add(item.asInt())
            }
            val location = Stop(
                id,
                name,
                latitude,
                longitude
            )
            locations.add(location)
        }
        return locations
    }
}
