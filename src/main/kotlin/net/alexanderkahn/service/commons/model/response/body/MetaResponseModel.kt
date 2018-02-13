package net.alexanderkahn.service.commons.model.response.body

import net.alexanderkahn.service.commons.model.response.body.meta.ResponseMeta

data class MetaResponseModel(override val meta: ResponseMeta) : ResponseModel