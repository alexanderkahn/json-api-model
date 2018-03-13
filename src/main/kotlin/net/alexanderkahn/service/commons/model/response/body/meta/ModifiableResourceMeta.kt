package net.alexanderkahn.service.commons.model.response.body.meta

import com.fasterxml.jackson.annotation.JsonPropertyOrder
import java.time.OffsetDateTime

@JsonPropertyOrder("created", "lastModified")
data class ModifiableResourceMeta(val created: OffsetDateTime, val lastModified: OffsetDateTime) : ResourceMeta