package net.alexanderkahn.service.commons.model.response.body.meta

import java.time.OffsetDateTime

open class ObjectResponseMeta(val status: ResourceStatus = ResourceStatus.OK
) {
    val time: OffsetDateTime = OffsetDateTime.now()
}