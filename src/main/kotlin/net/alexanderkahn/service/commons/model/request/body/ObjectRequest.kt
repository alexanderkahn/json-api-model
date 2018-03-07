package net.alexanderkahn.service.commons.model.request.body

import javax.validation.Valid

class ObjectRequest<out O : RequestResourceObject>(@field:Valid val data: O)