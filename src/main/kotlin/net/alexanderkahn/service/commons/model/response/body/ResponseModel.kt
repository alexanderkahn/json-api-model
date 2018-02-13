package net.alexanderkahn.service.commons.model.response.body

import net.alexanderkahn.service.commons.model.response.body.meta.ResponseMeta

interface ResponseModel {
    val meta: ResponseMeta
}