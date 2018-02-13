package net.alexanderkahn.service.commons.model.response.body

import net.alexanderkahn.service.commons.model.response.body.data.ResponseData
import net.alexanderkahn.service.commons.model.response.body.data.ResponseResourceObject
import net.alexanderkahn.service.commons.model.response.body.meta.ResponseMeta

data class DataResponseModel<out Data : ResponseData>(override val meta: ResponseMeta, val data: Data, val included: List<ResponseResourceObject>? = null) : ResponseModel