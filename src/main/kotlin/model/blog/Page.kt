package model.blog

data class Page(
    val currentPage: Int,
    val hasPrevious: Boolean,
    val maxPage: Int,
    val pageSize: Int,
    val paged: Boolean,
    val total: Int
)