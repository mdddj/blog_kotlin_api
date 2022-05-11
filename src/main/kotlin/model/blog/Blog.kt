package model.blog

data class Blog (
    val aliasString: String,
    val author: String,
    val category: Category,
    val content: String,
    val createTime: Long,
    val dateString: String,
    val id: Int,
    val tags: List<Tag>,
    val thumbnail: String,
    val title: String
)