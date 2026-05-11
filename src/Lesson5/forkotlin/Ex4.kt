package Lesson5.forkotlin

fun isAllPositive(arr: IntArray): Boolean {
    for (num in arr) {
        if (num <= 0) {
            return false
        }
    }
    return true
}

fun main() {

    val arr = intArrayOf(5, 2, 9, 1, -7, 40)

    println("Array: ${arr.joinToString()}")

    val result = isAllPositive(arr)

    if (result) {
        println("The array contains only positive numbers")
    } else {
        println("The array contains zero or negative numbers")
    }
}