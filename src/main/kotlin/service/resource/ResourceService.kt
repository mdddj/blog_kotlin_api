package service.resource

import model.JSONResult
import model.resource.ResourceCategory
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * 频道分类接口
 */
interface ResourceService {

    @GET("/api/rc/findByType")
    suspend fun getResourceCategortByType(@Query("type") type: String) : JSONResult<List<ResourceCategory>>
}