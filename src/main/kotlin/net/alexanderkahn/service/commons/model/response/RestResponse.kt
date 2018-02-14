package net.alexanderkahn.service.commons.model.response

import net.alexanderkahn.service.commons.model.response.body.ResponseModel

abstract class RestResponse<out M : ResponseModel>(val body: M)