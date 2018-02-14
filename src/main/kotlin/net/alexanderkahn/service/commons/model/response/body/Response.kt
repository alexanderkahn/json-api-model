package net.alexanderkahn.service.commons.model.response.body

import net.alexanderkahn.service.commons.model.response.body.meta.ResponseMeta

interface Response {
    val meta: ResponseMeta
}