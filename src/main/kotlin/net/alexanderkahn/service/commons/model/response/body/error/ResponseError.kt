package net.alexanderkahn.service.commons.model.response.body.error

import net.alexanderkahn.service.commons.model.exception.ResponseStatusException

data class ResponseError(val code: String, val detail: String) {
    constructor(e: ResponseStatusException) : this(e::class.java.name, e.message.orEmpty())
}