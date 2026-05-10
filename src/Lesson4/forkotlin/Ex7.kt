package Lesson4.forkotlin

fun main() {
    println("Enter '7' ")
    val t = readln().toInt()
    println("Enter the data from homework #6")

    repeat(t) {
        val words = readln().split(" ")

        val result = buildString {
            append(words[0].first())
            append(words[1].first())
            append(words[2].first())
        }

        println(result)
    }
}