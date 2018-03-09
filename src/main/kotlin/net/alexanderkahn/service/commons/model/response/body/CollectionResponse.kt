package net.alexanderkahn.service.commons.model.response.body

import com.fasterxml.jackson.annotation.JsonPropertyOrder
import net.alexanderkahn.service.commons.model.response.body.data.ResourceObject
import net.alexanderkahn.service.commons.model.response.body.meta.CollectionResponseMeta
import net.alexanderkahn.service.commons.model.response.body.meta.ResourceStatus

@JsonPropertyOrder("meta", "data", "included")
class CollectionResponse<out RO: ResourceObject>(
        val data: List<RO>,
        page: CollectionResponseMeta.Page,
        val included: List<ResourceObject>? = null
) : Response {
    override val meta: CollectionResponseMeta = CollectionResponseMeta(page)
}