package net.alexanderkahn.service.commons.model

import net.alexanderkahn.service.commons.model.response.body.*
import net.alexanderkahn.service.commons.model.response.body.data.ResourceObject
import net.alexanderkahn.service.commons.model.response.body.error.ResponseError
import net.alexanderkahn.service.commons.model.response.body.meta.CollectionResponseMeta
import net.alexanderkahn.service.commons.model.response.body.meta.ObjectResponseMeta
import net.alexanderkahn.service.commons.model.response.body.meta.ResourceStatus
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import java.util.*

internal class ResourceStatusTest {

    @Nested inner class ObjectResponseTest {
        @Test fun returnsOkStatus() {
            val objectResponse = ObjectResponse(TestResourceObject())
            assertEquals(objectResponse.meta.status, ResourceStatus.OK)
        }
    }

    @Nested inner class CollectionResponseTest {
        @Test fun returnsOkStatus() {
            val page = CollectionResponseMeta.Page(true, true, 1, 1, 1, 1, null, null)
            val collectionResponse = CollectionResponse(listOf(TestResourceObject()), page)
            assertEquals(collectionResponse.meta.status, ResourceStatus.OK)
        }

    }
    @Nested inner class CreatedResponseTest {
        @Test fun returnsCreatedStatus() {
            val createdResponse = ObjectCreatedResponse(TestResourceObject())
            assertEquals(createdResponse.meta.status, ResourceStatus.CREATED)
        }

    }
    @Nested inner class DeletedResponseTest {
        @Test fun returnsOkStatus() {
            val deletedResponse = DeletedResponse()
            assertEquals(deletedResponse.meta.status, ResourceStatus.OK)
        }

    }

    @Nested inner class ErrorsResponseTest {
        @Test fun returnsSpecifiedStatus() {
            val conflictResponse = ErrorsResponse(ObjectResponseMeta(ResourceStatus.CONFLICT), setOf(ResponseError(ResourceStatus.CONFLICT, "Exception", "oh no")))
            assertEquals(conflictResponse.meta.status, ResourceStatus.CONFLICT)
            assertEquals(1, conflictResponse.errors.size)

            val multipleErrorsResponse = ErrorsResponse(
                    ObjectResponseMeta(ResourceStatus.BAD_REQUEST), setOf(
                    ResponseError(ResourceStatus.CONFLICT, "Exception", "oh no"),
                    ResponseError(ResourceStatus.NOT_FOUND, "Another Exception", "bother")
            ))
            assertEquals(multipleErrorsResponse.meta.status, ResourceStatus.BAD_REQUEST)
            assertEquals(2, multipleErrorsResponse.errors.size)
        }

    }

    @Nested inner class DefaultReasonPhraseTest {
        @Test fun retainsOKCapitalization() {
            assertEquals("OK", ResourceStatus.OK.defaultReasonPhrase())
        }

        @Test fun capitalizesAndSpaces() {
            assertEquals("Not Implemented", ResourceStatus.NOT_IMPLEMENTED.defaultReasonPhrase())
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