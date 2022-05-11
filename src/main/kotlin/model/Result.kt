package model


data class Result<T> (
    val state: Int,
    val message: String,
    val data: T
)

/**
 * 请求是否成功
 */
fun Result<Any>.success() : Boolean{
    return this.state == 200;
}