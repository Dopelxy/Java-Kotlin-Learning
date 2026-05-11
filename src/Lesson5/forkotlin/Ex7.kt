package Lesson5.forkotlin

fun moveZerosToEnd(arr: IntArray) {

    var index = 0

    for (num in arr) {

        if (num != 0) {
            arr[index] = num
            index++
        }
    }

    while (index < arr.size) {
        arr[index] = 0
        index++
    }
}

fun main() {

    val arr = intArrayOf(0, 1, 0, 3, 12)

    println("Original array: ${arr.joinToString()}")

    moveZerosToEnd(arr)

    println("Modified array: ${arr.joinToString()}")
}