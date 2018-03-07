package net.alexanderkahn.service.commons.model.request.validation

import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

class ExpectedTypeValidator : ConstraintValidator<ExpectedType, String> {

    private lateinit var expectedTypeValue: String

    override fun initialize(constraintAnnotation: ExpectedType) {
        super.initialize(constraintAnnotation)
        expectedTypeValue = constraintAnnotation.value
    }

    override fun isValid(value: String, context: ConstraintValidatorContext): Boolean {
        return value == expectedTypeValue
    }
}