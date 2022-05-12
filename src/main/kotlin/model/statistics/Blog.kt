package model.statistics

data class SimpleBlog(
    val createTime: Long,
    val decoratedClass: Any,
    val id: Int,
    val target: Target,
    val targetClass: String,
    val title: String
)