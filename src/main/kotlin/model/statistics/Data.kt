package model.statistics

import model.blog.Category
import model.blog.Tag

data class StatisticsData(
    val archiveModels: List<ArchiveModel>,
    val blogCount: Int,
    val cateCount: Int,
    val categoryList: List<Category>,
    val monthsCounts: List<MonthsCount>,
    val tagCount: Int,
    val tags: List<Tag>
)