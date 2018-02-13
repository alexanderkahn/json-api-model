package net.alexanderkahn.service.commons.model.response

import net.alexanderkahn.service.commons.model.response.body.DataResponseModel
import net.alexanderkahn.service.commons.model.response.body.data.ResponseResourceCollection
import net.alexanderkahn.service.commons.model.response.body.data.ResponseResourceObject
import net.alexanderkahn.service.commons.model.response.body.meta.ResponseMeta
import net.alexanderkahn.service.commons.model.response.body.meta.ResponseMetaPage
import net.alexanderkahn.service.commons.model.response.body.meta.ResponseStatus

class CollectionResponse<RO: ResponseResourceObject>(restModels: ResponseResourceCollection<RO>, page: ResponseMetaPage, included: List<ResponseResourceObject>? = null)
    : RestResponse<DataResponseModel<ResponseResourceCollection<RO>>>(
        DataResponseModel<ResponseResourceCollection<RO>>(ResponseMeta(status, page = page), restModels, included)
)

private val status = ResponseStatus.OK