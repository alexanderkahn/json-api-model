package net.alexanderkahn.service.commons.model.response.body.meta

class CollectionResponseMeta(
        status: ResourceStatus = ResourceStatus.OK,
        val page: Page
): ObjectResponseMeta(status) {

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