package net.alexanderkahn.service.commons.model.exception

import net.alexanderkahn.service.commons.model.response.body.meta.ResponseStatus
import java.util.*

class BadRequestException : ResponseStatusException {
    constructor() : super()
    constructor(message: String) : super(message)

    override val status: ResponseStatus = ResponseStatus.BAD_REQUEST
}

class InvalidStateException : ResponseStatusException {
    constructor() : super()
    constructor(message: String) : super(message)

    override val status: ResponseStatus = ResponseStatus.INTERNAL_SERVER_ERROR

}

class NotFoundException : ResponseStatusException {
    constructor() : super()
    constructor(message: String) : super(message)
    constructor(type: String, id: UUID) : this("No object found of type $type with ID $id")

    override val status: ResponseStatus = ResponseStatus.NOT_FOUND

}

class NotImplementedException : ResponseStatusException {
    constructor() : super()
    constructor(message: String) : super(message)

    override val status: ResponseStatus = ResponseStatus.NOT_IMPLEMENTED

}

class UnauthenticatedException : ResponseStatusException {
    constructor() : super()
    constructor(message: String) : super(message)

    override val status: ResponseStatus = ResponseStatus.UNAUTHORIZED
}

class ConflictException: ResponseStatusException {
    constructor() : super()
    constructor(message: String) : super(message)

    override val status: ResponseStatus = ResponseStatus.CONFLICT
}

abstract class ResponseStatusException : RuntimeException {
    constructor() : super()
    constructor(message: String) : super(message)

    abstract val status: ResponseStatus
}

fun Exception.toResponse(): ResponseStatusException {
    return this as? ResponseStatusException ?: InvalidStateException(this.message.orEmpty())
}