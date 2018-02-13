package net.alexanderkahn.service.commons.model.request

class ObjectRequest<out O : RequestResourceObject>(val data: O)