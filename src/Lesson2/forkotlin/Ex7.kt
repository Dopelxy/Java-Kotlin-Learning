package Lesson2.forkotlin

fun main(args: Array<String>) {
    println("Enter N: ")
    val n = readln().toInt()
    for (i in 1..10) {

        val result = n * i
        println("$n x $i = $result")
    }


}