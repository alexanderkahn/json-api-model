package net.alexanderkahn.service.commons.model.response.body.data

import net.alexanderkahn.service.commons.model.exception.ConflictException
import java.util.*

data class ResourceIdentifier(val type: String, val id: UUID) : ResponseData {
    fun assertType(expectedType: String) {
        if (type != expectedType) throw ConflictException("Invalid type: $type")
    }
}