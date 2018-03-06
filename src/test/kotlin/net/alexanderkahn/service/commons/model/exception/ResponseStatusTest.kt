package net.alexanderkahn.service.commons.model.exception

import net.alexanderkahn.service.commons.model.response.body.*
import net.alexanderkahn.service.commons.model.response.body.data.ResourceObject
import net.alexanderkahn.service.commons.model.response.body.error.ResponseError
import net.alexanderkahn.service.commons.model.response.body.meta.CollectionResponseMeta
import net.alexanderkahn.service.commons.model.response.body.meta.ObjectResponseMeta
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
            val page = CollectionResponseMeta.Page(true, true, 1, 1, 1, 1, null, null)
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

    @Nested inner class ErrorsResponseTest {
        @Test fun returnsSpecifiedStatus() {
            val conflictResponse = ErrorsResponse(ObjectResponseMeta(ResponseStatus.CONFLICT), setOf(ResponseError(ConflictException())))
            assertEquals(conflictResponse.meta.status, ResponseStatus.CONFLICT)
            assertEquals(1, conflictResponse.errors.size)

            val multipleErrorsResponse = ErrorsResponse(
                    ObjectResponseMeta(ResponseStatus.BAD_REQUEST),
                    setOf(ResponseError(ConflictException()), ResponseError(BadRequestException()))
            )
            assertEquals(multipleErrorsResponse.meta.status, ResponseStatus.BAD_REQUEST)
            assertEquals(2, multipleErrorsResponse.errors.size)
        }

    }
}

class TestResourceObject : ResourceObject {
    override val type = "TEST"
    override val id = UUID.randomUUID()!!
    override val meta: Nothing? =  null
    override val attributes: Nothing? = null
    override val relationships: Nothing? = null
}