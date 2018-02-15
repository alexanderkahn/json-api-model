package net.alexanderkahn.service.commons.model.response.body

import net.alexanderkahn.service.commons.model.response.body.meta.ObjectResponseMeta

interface Response {
    val meta: ObjectResponseMeta
}