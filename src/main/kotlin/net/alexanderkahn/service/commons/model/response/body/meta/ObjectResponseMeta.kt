package net.alexanderkahn.service.commons.model.response.body.meta

import com.fasterxml.jackson.annotation.JsonPropertyOrder
import java.time.OffsetDateTime

@JsonPropertyOrder("status", "time")
open class ObjectResponseMeta(val status: ResourceStatus = ResourceStatus.OK
) {
    val time: OffsetDateTime = OffsetDateTime.now()
}