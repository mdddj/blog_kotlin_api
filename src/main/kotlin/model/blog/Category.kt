package model.blog

data class Category(
    val createTime: Long,
    val id: Int,
    val intro: String,
    val logo: String,
    val name: String
)