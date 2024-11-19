package org.liveCommuteApi.configuration

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.module.SimpleModule
import org.liveCommuteApi.serialization.StopsDeserializer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class MapperConfiguration {
    @Bean
    fun getMapper(): ObjectMapper {
        val mapper = ObjectMapper()
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
        mapper.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE)
        val module = SimpleModule()
        module.addDeserializer(List::class.java, StopsDeserializer())
        mapper.registerModule(module)
        return mapper
    }
}