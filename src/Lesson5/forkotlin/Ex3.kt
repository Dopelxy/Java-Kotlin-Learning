package Lesson5.forkotlin

fun firstMaxIndex(arr: IntArray): Int {

    var max = arr[0]
    var index = 0

    for (i in arr.indices) {
        if (arr[i] > max) {
            max = arr[i]
            index = i
        }
    }

    return index
}

fun main() {
    val arr = intArrayOf(5, 2, 9, 1, 7, 40)

    val result = firstMaxIndex(arr)

    println("Index of first max: $result")
}