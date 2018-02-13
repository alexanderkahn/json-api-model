package net.alexanderkahn.service.commons.model.response

import net.alexanderkahn.service.commons.model.response.body.DataResponseModel
import net.alexanderkahn.service.commons.model.response.body.data.ResponseData
import net.alexanderkahn.service.commons.model.response.body.data.ResponseResourceObject
import net.alexanderkahn.service.commons.model.response.body.meta.ResponseMeta
import net.alexanderkahn.service.commons.model.response.body.meta.ResponseStatus

private val status = ResponseStatus.OK

class ObjectResponse<D : ResponseData>(restModel: D, included: List<ResponseResourceObject>? = null)
    : RestResponse<DataResponseModel<D>>(DataResponseModel<D>(ResponseMeta(status), restModel, included))
