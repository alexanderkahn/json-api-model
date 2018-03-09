package net.alexanderkahn.service.commons.model

import net.alexanderkahn.service.commons.model.response.body.meta.ResourceStatus
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

internal class ResourceStatusTest {

    @Nested inner class DefaultReasonPhraseTest {
        @Test fun retainsOKCapitalization() {
            assertEquals("OK", ResourceStatus.OK.defaultReasonPhrase())
        }

        @Test fun capitalizesAndSpaces() {
            assertEquals("Not Implemented", ResourceStatus.NOT_IMPLEMENTED.defaultReasonPhrase())
        }
    }
}