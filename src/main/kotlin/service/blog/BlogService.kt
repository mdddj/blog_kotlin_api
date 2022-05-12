package service.blog

import model.JSONResult
import model.blog.BlogData
import model.statistics.StatisticsData
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
    suspend fun getBlogs(@Query("page") page: Int,@Query("pageSize") pageSize: Int): JSONResult<BlogData>

    /**
     * 获取博客的统计信息
     */
    @GET("/api/blog/statistics")
    suspend fun getStatistics(): JSONResult<StatisticsData>
}