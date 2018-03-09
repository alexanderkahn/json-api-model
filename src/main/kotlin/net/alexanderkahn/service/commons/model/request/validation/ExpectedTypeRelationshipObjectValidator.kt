package net.alexanderkahn.service.commons.model.request.validation

import net.alexanderkahn.service.commons.model.response.body.data.RelationshipObject
import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

class ExpectedTypeRelationshipObjectValidator : ConstraintValidator<ExpectedType, RelationshipObject> {

    private lateinit var expectedTypeValue: String

    override fun initialize(constraintAnnotation: ExpectedType) {
        super.initialize(constraintAnnotation)
        expectedTypeValue = constraintAnnotation.value
    }

    override fun isValid(value: RelationshipObject, context: ConstraintValidatorContext): Boolean {
        return value.data.type == expectedTypeValue
    }
}