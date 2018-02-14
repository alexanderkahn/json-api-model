package net.alexanderkahn.service.commons.model.response.body.meta

import java.time.OffsetDateTime

//TODO: make a separate pagedmeta that extends this
data class ResponseMeta(val status: ResponseStatus = ResponseStatus.OK,
                        val page: ResponseMetaPage? = null
) {
    val time: OffsetDateTime = OffsetDateTime.now()
}