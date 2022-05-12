package model.statistics

data class ArchiveModel(
    val blogs: List<SimpleBlog>,
    val count: Int,
    val months: String
)