package net.alexanderkahn.service.commons.model.response.body.meta

import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonPropertyOrder("time", "page")
class CollectionResponseMeta(val page: Page): ObjectResponseMeta() {

    data class Page(
            val first: Boolean,
            val last: Boolean,
            val totalElements: Int,
            val totalPages: Int,
            val number: Int,
            val size: Int,
            val prev: Int?,
            val next: Int?
    )
}