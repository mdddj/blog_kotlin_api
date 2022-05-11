package service.blog

import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import service.ServiceCreate
import kotlin.test.Test

class BlogServiceTest {

    @Test
    fun testGetBlogList(){
        runBlocking {
            val job1 =  async {
               ServiceCreate.create<BlogService>().getBlogs(1,20)
            }
            val result = job1.await()
            println(result)
        }
    }
}