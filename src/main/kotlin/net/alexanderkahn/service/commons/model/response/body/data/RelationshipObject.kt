package net.alexanderkahn.service.commons.model.response.body.data

import java.util.*

data class RelationshipObject(val data: RelationshipObjectIdentifier) {
    constructor(type: String, id: UUID) : this(RelationshipObjectIdentifier(type, id))


    data class RelationshipObjectIdentifier(
            override val type: String,
            override val id: UUID
    ) : ResourceIdentifier
}