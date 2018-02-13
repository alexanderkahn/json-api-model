package net.alexanderkahn.service.commons.model.response.body.meta

import java.time.OffsetDateTime

data class ResponseMeta(val status: ResponseStatus,
                        val time: OffsetDateTime = OffsetDateTime.now(),
                        val page: ResponseMetaPage? = null
)