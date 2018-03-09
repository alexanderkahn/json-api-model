package net.alexanderkahn.service.commons.model.response.body.meta

import com.fasterxml.jackson.annotation.JsonPropertyOrder
import java.time.OffsetDateTime

@JsonPropertyOrder("time")
open class ObjectResponseMeta {
    val time: OffsetDateTime = OffsetDateTime.now()
}