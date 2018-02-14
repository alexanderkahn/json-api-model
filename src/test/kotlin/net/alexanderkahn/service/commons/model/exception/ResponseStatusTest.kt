package net.alexanderkahn.service.commons.model.exception

import net.alexanderkahn.service.commons.model.response.body.*
import net.alexanderkahn.service.commons.model.response.body.data.ResourceObject
import net.alexanderkahn.service.commons.model.response.body.meta.ResponseMetaPage
import net.alexanderkahn.service.commons.model.response.body.meta.ResponseStatus
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import java.util.*

internal class ResponseStatusTest {

    @Nested inner class ObjectResponseTest {
        @Test fun returnsOkStatus() {
            val objectResponse = ObjectResponse(TestResourceObject())
            assertEquals(objectResponse.meta.status, ResponseStatus.OK)
        }
    }

    @Nested inner class CollectionResponseTest {
        @Test fun returnsOkStatus() {
            val page = ResponseMetaPage(true, true, 1, 1, 1, 1, null, null)
            val collectionResponse = CollectionResponse(listOf(TestResourceObject()), page)
            assertEquals(collectionResponse.meta.status, ResponseStatus.OK)
        }

    }
    @Nested inner class CreatedResponseTest {
        @Test fun returnsCreatedStatus() {
            val createdResponse = ObjectCreatedResponse(TestResourceObject())
            assertEquals(createdResponse.meta.status, ResponseStatus.CREATED)
        }

    }
    @Nested inner class DeletedResponseTest {
        @Test fun returnsOkStatus() {
            val deletedResponse = DeletedResponse()
            assertEquals(deletedResponse.meta.status, ResponseStatus.OK)
        }

    }

    @Nested inner class ErrorResponseTest {
        @Test fun returnsSpecifiedStatus() {
            val conflictResponse = ErrorResponse(ConflictException())
            assertEquals(conflictResponse.meta.status, ResponseStatus.CONFLICT)
            val badRequestResponse = ErrorResponse(BadRequestException())
            assertEquals(badRequestResponse.meta.status, ResponseStatus.BAD_REQUEST)
        }

    }
}

class TestResourceObject : ResourceObject {
    override val type = "TEST"
    override val id = UUID.randomUUID()
    override val meta: Nothing? =  null
    override val attributes: Nothing? = null
    override val relationships: Nothing? = null
}