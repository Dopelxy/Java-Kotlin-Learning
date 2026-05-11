package Lesson5.forkotlin

fun main() {

    val arr = intArrayOf(5, 2, 9, 1, -7, 40)

    println("Original array: ${arr.joinToString()}")

    val temp = arr[0]

    arr[0] = arr[arr.size - 1]

    arr[arr.size - 1] = temp

    println("Modified array: ${arr.joinToString()}")
}