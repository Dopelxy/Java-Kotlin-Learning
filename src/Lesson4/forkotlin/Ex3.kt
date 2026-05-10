package Lesson4.forkotlin

fun main() {
    println("Welcome to the Berland to Birland translation verification program")
    println("Enter word: ")
    val s = readln()
    val t = readln()

    if (s.reversed() == t) {
        println("YES")
    } else {
        println("NO")
    }
}