package net.alexanderkahn.service.commons.model.response.body.data

import com.fasterxml.jackson.annotation.JsonPropertyOrder
import net.alexanderkahn.service.commons.model.response.body.meta.ResourceMeta
import java.util.*

@JsonPropertyOrder("type", "id", "meta", "attributes", "relationships")
interface ResourceObject : ResourceIdentifier {
    override val type: String
    override val id: UUID
    val meta: ResourceMeta?
    val attributes: Any?
    val relationships: Any?
}
