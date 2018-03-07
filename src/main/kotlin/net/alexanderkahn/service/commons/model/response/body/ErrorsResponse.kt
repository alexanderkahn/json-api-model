package net.alexanderkahn.service.commons.model.response.body

import net.alexanderkahn.service.commons.model.response.body.error.ResponseError
import net.alexanderkahn.service.commons.model.response.body.meta.ObjectResponseMeta

data class ErrorsResponse(override val meta: ObjectResponseMeta, val errors: Set<ResponseError>) : Response {
    constructor(error: ResponseError) : this(ObjectResponseMeta(error.status), setOf(error))
}