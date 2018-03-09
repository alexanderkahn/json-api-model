package net.alexanderkahn.service.commons.model.response.body

import com.fasterxml.jackson.annotation.JsonPropertyOrder
import net.alexanderkahn.service.commons.model.response.body.data.ResourceObject
import net.alexanderkahn.service.commons.model.response.body.meta.ObjectResponseMeta
import net.alexanderkahn.service.commons.model.response.body.meta.ResourceStatus

@JsonPropertyOrder("meta", "data", "included")
data class ObjectResponse<out RO : ResourceObject>(
        val data: RO,
        val included: List<ResourceObject>? = null
) : Response {
    override val meta: ObjectResponseMeta = ObjectResponseMeta()
}