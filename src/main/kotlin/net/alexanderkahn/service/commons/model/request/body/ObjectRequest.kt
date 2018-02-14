package net.alexanderkahn.service.commons.model.request.body

class ObjectRequest<out O : RequestResourceObject>(val data: O)