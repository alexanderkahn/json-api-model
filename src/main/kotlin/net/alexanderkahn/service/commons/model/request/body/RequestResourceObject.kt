package net.alexanderkahn.service.commons.model.request.body

interface RequestResourceObject {
    val type: String
    val attributes: Any?
    val relationships: Any?
}