package net.alexanderkahn.service.commons.model.response.body

import net.alexanderkahn.service.commons.model.response.body.meta.ObjectResponseMeta
import net.alexanderkahn.service.commons.model.response.body.meta.ResourceStatus

class DeletedResponse : Response {
    override val meta: ObjectResponseMeta = ObjectResponseMeta()
}