package net.alexanderkahn.service.commons.model.response.body.error

import net.alexanderkahn.service.commons.model.response.body.meta.ResourceStatus

data class ResponseError(val status: Int, val title: String, val detail: String) {
    constructor(status: ResourceStatus, title: String, detail: String) : this(status.statusCode, title, detail)
}