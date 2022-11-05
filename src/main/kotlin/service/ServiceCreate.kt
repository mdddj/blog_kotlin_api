package service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * 单例类,创建实体对象
 */



abstract class ServiceCreateBase(host: String) {
    private val retrofit =
        Retrofit.Builder().baseUrl(host).addConverterFactory(GsonConverterFactory.create())
            .build()
    fun <T> create(serverClass: Class<T>): T = retrofit.create(serverClass)
    inline fun <reified T> create(): T = create(T::class.java)
}

object ServiceCreateWithServer : ServiceCreateBase("https://itbug.shop")
object ServiceCreateWithHost: ServiceCreateBase("http://127.0.0.1")
object ServiceCreateWithLocalhost: ServiceCreateBase("http://localhost")

object ServiceCreate {
    var server = ServiceCreateWithServer
    var host = ServiceCreateWithHost
    var localhost = ServiceCreateWithLocalhost
}
