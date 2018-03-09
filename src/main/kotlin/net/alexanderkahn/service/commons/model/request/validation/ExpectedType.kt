package net.alexanderkahn.service.commons.model.request.validation

import javax.validation.Constraint
import javax.validation.Payload
import kotlin.reflect.KClass

@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@Constraint(validatedBy = [ExpectedTypeValidator::class, ExpectedTypeRelationshipObjectValidator::class])
annotation class ExpectedType(
        val value: String,
        val message: String = "Unexpected type",
        val groups: Array<KClass<*>> = [],
        val payload: Array<KClass<out Payload>> = []
)