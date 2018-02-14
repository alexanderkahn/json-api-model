package net.alexanderkahn.service.commons.model.response.body

import net.alexanderkahn.service.commons.model.exception.ResponseStatusException
import net.alexanderkahn.service.commons.model.response.body.error.ResponseError
import net.alexanderkahn.service.commons.model.response.body.meta.ResponseMeta

data class ErrorResponse(override val meta: ResponseMeta, val error: ResponseError) : Response {
    constructor(exception: ResponseStatusException) : this(ResponseMeta(exception.status), ResponseError(exception))
}