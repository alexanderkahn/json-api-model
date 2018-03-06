package net.alexanderkahn.service.commons.model.response.body.meta

enum class ResourceStatus(val statusCode: Int, val reasonPhrase: String) {
    OK(200, "OK"),
    CREATED(201, "Created"),
    ACCEPTED(202, "Accepted"),
    BAD_REQUEST(400, "Bad Request"),
    UNAUTHORIZED(401, "Unauthorized"),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(404, "Not Found"),
    CONFLICT(409, "Conflict"),
    UNSUPPORTED_MEDIA_TYPE(415, "Unsupported Media Type"),
    UNPROCESSABLE_ENTITY(422, "Unprocessable Entity"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
    NOT_IMPLEMENTED(501, "Not Implemented")
}

fun resourceStatusof(code: Int): ResourceStatus {
    return ResourceStatus.values().find { it.statusCode == code } ?: ResourceStatus.INTERNAL_SERVER_ERROR
}