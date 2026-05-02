package Lesson2.forkotlin

fun main(args: Array<String>) {
    println("Enter n; ")
    val n = readln().toInt()
    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    println(sum)

}