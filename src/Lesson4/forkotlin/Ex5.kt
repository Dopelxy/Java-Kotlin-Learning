package Lesson4.forkotlin

fun main() {
    println("Enter the lines from homework #5:")
    println("Enter the first line: ")
    val a = readln()
    println("Enter the second line: ")
    val b = readln()
    println("Result: ")
    val s1 = a.lowercase()
    val s2 = b.lowercase()

    if (s1 < s2) {
        println(-1)
    } else if (s1 > s2) {
        println(1)
    } else {
        println(0)
    }
}