package Lesson2.forkotlin

fun main(args: Array<String>) {

    println("Enter num1: ")
    val num1 = readln().toInt()
    if (num1 % 2 == 0) {
        println("number is even")
    } else {
        println(" number is odd")
    }

}