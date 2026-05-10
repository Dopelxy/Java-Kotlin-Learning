package Lesson4.forkotlin

fun main() {

    print("Enter word: ")
    val word = readln()

    val firstLetter = word.substring(0, 1).uppercase()

    val rest = word.substring(1)

    val result = firstLetter + rest

    println(result)
}