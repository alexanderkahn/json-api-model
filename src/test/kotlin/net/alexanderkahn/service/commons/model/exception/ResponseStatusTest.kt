package net.alexanderkahn.service.commons.model.exception

import net.alexanderkahn.service.commons.model.response.*
import net.alexanderkahn.service.commons.model.response.body.data.ResponseResourceCollection
import net.alexanderkahn.service.commons.model.response.body.data.ResponseResourceObject
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
            assertEquals(objectResponse.body.meta.status, ResponseStatus.OK)
        }
    }

    @Nested inner class CollectionResponseTest {
        @Test fun returnsOkStatus() {
            val page = ResponseMetaPage(true, true, 1, 1, 1, 1, null, null)
            val collectionResponse = CollectionResponse(ResponseResourceCollection(TestResourceObject()), page)
            assertEquals(collectionResponse.body.meta.status, ResponseStatus.OK)
        }

    }
    @Nested inner class CreatedResponseTest {
        @Test fun returnsCreatedStatus() {
            val createdResponse = CreatedResponse(TestResourceObject())
            assertEquals(createdResponse.body.meta.status, ResponseStatus.CREATED)
        }

    }
    @Nested inner class DeletedResponseTest {
        @Test fun returnsOkStatus() {
            val deletedResponse = DeletedResponse()
            assertEquals(deletedResponse.body.meta.status, ResponseStatus.OK)
        }

    }

    @Nested inner class ErrorResponseTest {
        @Test fun returnsSpecifiedStatus() {
            val conflictResponse = ErrorResponse(ConflictException())
            val badRequestResponse = ErrorResponse(BadRequestException())
            assertEquals(conflictResponse.body.meta.status, ResponseStatus.CONFLICT)
            assertEquals(badRequestResponse.body.meta.status, ResponseStatus.BAD_REQUEST)
        }

    }
}

class TestResourceObject : ResponseResourceObject {
    override val type = "TEST"
    override val id = UUID.randomUUID()
    override val meta: Nothing? =  null
    override val attributes: Nothing? = null
    override val relationships: Nothing? = null
}