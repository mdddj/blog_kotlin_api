package service.blog

import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import model.ok
import service.ServiceCreate
import kotlin.test.Test
import kotlin.test.assertTrue

class BlogServiceTest {

    @Test
    fun testGetBlogList(){
        runBlocking {
            val job1 =  async {
               ServiceCreate.create<BlogService>().getBlogs(1,20)
            }
            val result = job1.await()
            assertTrue { result.state.ok() }
        }
    }

    @Test
    fun testStatisticsTest(){
        runBlocking {
            val job = async {
                ServiceCreate.create<BlogService>().getStatistics()
            }
            val result = job.await()
            assertTrue { result.state.ok() }
        }
    }
}