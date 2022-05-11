package service.blog

import model.blog.BlogData
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * 博客相关接口服务
 */
interface BlogService {

    /**
     * 获取博客列表
     */
    @GET("/api/blog/list")
    suspend fun getBlogs(@Query("page") page: Int,@Query("pageSize") pageSize: Int): Result<BlogData>
}