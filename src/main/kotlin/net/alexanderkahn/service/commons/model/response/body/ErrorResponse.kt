package net.alexanderkahn.service.commons.model.response.body

import net.alexanderkahn.service.commons.model.exception.ResponseStatusException
import net.alexanderkahn.service.commons.model.response.body.error.ResponseError
import net.alexanderkahn.service.commons.model.response.body.meta.ObjectResponseMeta

data class ErrorResponse(override val meta: ObjectResponseMeta, val error: ResponseError) : Response {
    constructor(exception: ResponseStatusException) : this(ObjectResponseMeta(exception.status), ResponseError(exception))
}