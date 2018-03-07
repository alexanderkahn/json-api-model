package net.alexanderkahn.service.commons.model.response.body.error

import net.alexanderkahn.service.commons.model.response.body.meta.ResourceStatus

data class ResponseError(val status: ResourceStatus, val title: String, val detail: String) {
    constructor(status: ResourceStatus, exception: Exception) : this(status, status.defaultReasonPhrase(), exception.message.orEmpty())
}