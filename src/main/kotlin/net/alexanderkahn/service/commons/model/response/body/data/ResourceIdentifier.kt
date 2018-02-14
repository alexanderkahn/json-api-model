package net.alexanderkahn.service.commons.model.response.body.data

import net.alexanderkahn.service.commons.model.exception.ConflictException
import java.util.*

interface ResourceIdentifier{
    val type: String
    val id: UUID

    fun assertType(expectedType: String) {
        if (type != expectedType) throw ConflictException("Invalid type: $type")
    }
}