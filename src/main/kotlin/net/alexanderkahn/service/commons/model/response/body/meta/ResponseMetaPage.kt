package net.alexanderkahn.service.commons.model.response.body.meta

data class ResponseMetaPage(
        val first: Boolean,
        val last: Boolean,
        val totalElements: Int,
        val totalPages: Int,
        val number: Int,
        val size: Int,
        val prev: Int?,
        val next: Int?
)