package net.alexanderkahn.service.commons.model.response

import net.alexanderkahn.service.commons.model.response.body.MetaResponseModel
import net.alexanderkahn.service.commons.model.response.body.meta.ResponseMeta
import net.alexanderkahn.service.commons.model.response.body.meta.ResponseStatus

class DeletedResponse : RestResponse<MetaResponseModel>(MetaResponseModel(ResponseMeta(ResponseStatus.OK)))