package net.alexanderkahn.service.commons.model.response.body.meta

enum class ResourceStatus(val statusCode: Int) {
    OK(200),
    CREATED(201),
    ACCEPTED(202),
    BAD_REQUEST(400),
    UNAUTHORIZED(401),
    FORBIDDEN(403),
    NOT_FOUND(404),
    CONFLICT(409),
    UNSUPPORTED_MEDIA_TYPE(415),
    UNPROCESSABLE_ENTITY(422),
    INTERNAL_SERVER_ERROR(500),
    NOT_IMPLEMENTED(501);

    fun defaultReasonPhrase(): String = when (this.name) {
        "OK" -> name
        else -> name.split("_").map { it.toLowerCase().capitalize() }.joinToString(" ")
    }
}

fun resourceStatusOf(code: Int): ResourceStatus {
    return ResourceStatus.values().find { it.statusCode == code } ?: ResourceStatus.INTERNAL_SERVER_ERROR
}