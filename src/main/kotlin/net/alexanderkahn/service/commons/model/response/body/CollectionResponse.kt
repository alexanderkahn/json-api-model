package net.alexanderkahn.service.commons.model.response.body

import net.alexanderkahn.service.commons.model.response.body.data.ResourceObject
import net.alexanderkahn.service.commons.model.response.body.meta.ResponseMeta
import net.alexanderkahn.service.commons.model.response.body.meta.ResponseMetaPage
import net.alexanderkahn.service.commons.model.response.body.meta.ResponseStatus

class CollectionResponse<out RO: ResourceObject>(
        val data: List<RO>,
        page: ResponseMetaPage,
        val included: List<ResourceObject>? = null
) : Response {
    override val meta: ResponseMeta = ResponseMeta(ResponseStatus.OK, page)
}