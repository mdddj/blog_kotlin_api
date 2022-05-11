package service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * 单例类,创建实体对象
 */
object ServiceCreate {

    private const val BASE_URL = "https://itbug.shop/"

    private val retrofit =
        Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
            .build()

    fun <T> create(serverClass: Class<T>): T = retrofit.create(serverClass)

    inline fun <reified T> create(): T = create(T::class.java)
}