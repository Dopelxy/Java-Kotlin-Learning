package Lesson7.forkotlin.Ex5

class Book(
    var title: String,
    var author: String,
    var year: Int

) {
    override fun toString(): String {
        return "Книга: '$title' ($author, $year)"
    }
}




