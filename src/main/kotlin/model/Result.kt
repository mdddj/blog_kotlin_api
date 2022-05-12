package model


data class JSONResult<T> (
    val state: Int,
    val message: String,
    val data: T
)

fun Int.ok(): Boolean{
    return this == 200
}