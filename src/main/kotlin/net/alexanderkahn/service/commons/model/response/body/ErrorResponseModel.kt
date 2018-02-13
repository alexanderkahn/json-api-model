package net.alexanderkahn.service.commons.model.response.body

import net.alexanderkahn.service.commons.model.response.body.error.ResponseError
import net.alexanderkahn.service.commons.model.response.body.meta.ResponseMeta

data class ErrorResponseModel(override val meta: ResponseMeta, val error: ResponseError) : ResponseModel