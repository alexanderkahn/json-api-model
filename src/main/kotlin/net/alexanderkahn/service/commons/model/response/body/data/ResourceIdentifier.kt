package net.alexanderkahn.service.commons.model.response.body.data

import java.util.*

interface ResourceIdentifier{
    val type: String
    val id: UUID
}