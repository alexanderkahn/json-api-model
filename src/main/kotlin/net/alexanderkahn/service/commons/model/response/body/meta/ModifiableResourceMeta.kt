package net.alexanderkahn.service.commons.model.response.body.meta

import java.time.OffsetDateTime

data class ModifiableResourceMeta(val created: OffsetDateTime, val lastModified: OffsetDateTime) : ResourceMeta