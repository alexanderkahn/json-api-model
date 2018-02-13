package net.alexanderkahn.service.commons.model.request.filter

import java.util.*

data class RequestResourceFilter(val filterField: String, val filterTerms: List<UUID>)