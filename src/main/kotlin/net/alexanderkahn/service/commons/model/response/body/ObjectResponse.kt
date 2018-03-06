package net.alexanderkahn.service.commons.model.response.body

import net.alexanderkahn.service.commons.model.response.body.data.ResourceObject
import net.alexanderkahn.service.commons.model.response.body.meta.ObjectResponseMeta
import net.alexanderkahn.service.commons.model.response.body.meta.ResourceStatus

data class ObjectResponse<out RO : ResourceObject>(
        val data: RO,
        val included: List<ResourceObject>? = null
) : Response {
    override val meta: ObjectResponseMeta = ObjectResponseMeta(ResourceStatus.OK)
}