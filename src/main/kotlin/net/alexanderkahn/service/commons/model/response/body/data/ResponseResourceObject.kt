package net.alexanderkahn.service.commons.model.response.body.data

import net.alexanderkahn.service.commons.model.response.body.meta.ResourceMeta
import java.util.*

interface ResponseResourceObject : ResponseData {
    val type: String
    val id: UUID
    val meta: ResourceMeta?
    val attributes: Any?
    val relationships: Any?

    fun toIdentifier() : ResourceIdentifier = ResourceIdentifier(this.type, this.id)
}
