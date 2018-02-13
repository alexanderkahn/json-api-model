package net.alexanderkahn.service.commons.model.response.body.data

class ResponseResourceCollection<RO: ResponseResourceObject>(resourceObjects: List<RO>) : ArrayList<RO>(resourceObjects), ResponseData {
    constructor(vararg resourceObjects: RO) : this(resourceObjects.asList())
}