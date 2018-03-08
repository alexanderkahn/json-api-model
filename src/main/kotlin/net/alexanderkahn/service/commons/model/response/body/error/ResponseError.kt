package net.alexanderkahn.service.commons.model.response.body.error

import com.fasterxml.jackson.annotation.JsonPropertyOrder
import net.alexanderkahn.service.commons.model.response.body.meta.ResourceStatus

@JsonPropertyOrder("status", "title", "detail")
data class ResponseError(val status: ResourceStatus, val title: String, val detail: String) {
    constructor(status: ResourceStatus, exception: Exception) : this(status, status.defaultReasonPhrase(), exception.message.orEmpty())
}