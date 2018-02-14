package net.alexanderkahn.service.commons.model.request.body

import net.alexanderkahn.service.commons.model.exception.ConflictException

interface RequestResourceObject {
    val type: String
    val attributes: Any?
    val relationships: Any?

    fun validate()

    fun assertType(expectedType: String) {
        if (type != expectedType) throw ConflictException("Invalid type: $type")
    }
}