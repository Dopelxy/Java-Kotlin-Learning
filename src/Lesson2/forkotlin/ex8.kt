package Lesson2.forkotlin

fun main() {
    println("Enter N: ")
    val n = readln().toInt()
    var a = 0
    var b = 1

    for (i in 2..n) {
        val next = a + b
        a = b
        b = next
            }
    println("Fibonacci N: $b ")
    }
