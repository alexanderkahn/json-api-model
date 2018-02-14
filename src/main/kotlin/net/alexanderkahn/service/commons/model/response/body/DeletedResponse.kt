package net.alexanderkahn.service.commons.model.response.body

import net.alexanderkahn.service.commons.model.response.body.meta.ResponseMeta
import net.alexanderkahn.service.commons.model.response.body.meta.ResponseStatus

class DeletedResponse : Response {
    override val meta: ResponseMeta = ResponseMeta(ResponseStatus.OK)
}