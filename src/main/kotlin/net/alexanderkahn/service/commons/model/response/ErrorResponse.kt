package net.alexanderkahn.service.commons.model.response

import net.alexanderkahn.service.commons.model.exception.ResponseStatusException
import net.alexanderkahn.service.commons.model.response.body.ErrorResponseModel
import net.alexanderkahn.service.commons.model.response.body.error.ResponseError
import net.alexanderkahn.service.commons.model.response.body.meta.ResponseMeta

class ErrorResponse(exception: ResponseStatusException) :
        RestResponse<ErrorResponseModel>(ErrorResponseModel(ResponseMeta(exception.status), ResponseError(exception)))