package net.alexanderkahn.service.commons.model.response

import net.alexanderkahn.service.commons.model.response.body.DataResponseModel
import net.alexanderkahn.service.commons.model.response.body.data.ResponseData
import net.alexanderkahn.service.commons.model.response.body.meta.ResponseMeta
import net.alexanderkahn.service.commons.model.response.body.meta.ResponseStatus

class CreatedResponse<D : ResponseData>(restModel: D)
    : RestResponse<DataResponseModel<D>>(DataResponseModel<D>(ResponseMeta(status), restModel))

private val status = ResponseStatus.CREATED