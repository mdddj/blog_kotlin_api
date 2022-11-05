package service.resource

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import model.ok
import service.ServiceCreate
import kotlin.test.Test
import kotlin.test.assertTrue

class ResourceCategoryServerTest {

    val apis = ServiceCreate.host.create(ResourceService::class.java)
    @OptIn(DelicateCoroutinesApi::class)
    @Test
    fun getCategoryListList() {
        GlobalScope.launch {
           val response = async {
               apis.getResourceCategortByType("idea-chat-room")
           }.await()

            assertTrue { response.data.size == 2 }
        }
    }
}