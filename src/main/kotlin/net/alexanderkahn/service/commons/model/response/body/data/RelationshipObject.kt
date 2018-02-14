package net.alexanderkahn.service.commons.model.response.body.data

import java.util.*

//TODO: this could probably be an internal class in ResourceObjectRelationship
data class RelationshipObject(
        override val type: String,
        override val id: UUID
) : ResourceIdentifier