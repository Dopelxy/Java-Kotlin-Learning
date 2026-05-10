package Lesson4.forkotlin

fun main() {
    println("Enter the following words one at a time:")
    println("4; word; localization; internationalization; pneumonoultramicroscopicsilicovolcanoconiosis")
    val n = readln().toInt()

    repeat(n) {
        val word = readln()

        if (word.length <= 10) {
            println(word)
        } else {
            val middle = word.length - 2
            println("${word.first()}$middle${word.last()}")
        }
    }
}