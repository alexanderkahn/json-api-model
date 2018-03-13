package net.alexanderkahn.service.commons.model.response.body.data

import com.fasterxml.jackson.annotation.JsonPropertyOrder
import net.alexanderkahn.service.commons.model.response.body.meta.ModifiableResourceMeta

@JsonPropertyOrder("type", "id", "meta", "attributes", "relationships")
interface ModifiableResourceObject : ResourceObject {
    override val meta: ModifiableResourceMeta
}