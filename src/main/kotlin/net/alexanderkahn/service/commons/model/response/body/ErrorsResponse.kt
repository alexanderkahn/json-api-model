package net.alexanderkahn.service.commons.model.response.body

import net.alexanderkahn.service.commons.model.response.body.error.ResponseError
import net.alexanderkahn.service.commons.model.response.body.meta.ObjectResponseMeta
import net.alexanderkahn.service.commons.model.response.body.meta.resourceStatusof

data class ErrorsResponse(override val meta: ObjectResponseMeta, val errors: Set<ResponseError>) : Response {
    constructor(error: ResponseError) : this(ObjectResponseMeta(resourceStatusof(error.status)), setOf(error))
}