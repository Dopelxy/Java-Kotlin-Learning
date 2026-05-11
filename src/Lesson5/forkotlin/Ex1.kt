package Lesson5.forkotlin

fun main() {
    val arr = intArrayOf(5, 2, 9, 1, 7)

    var max = arr[0]
    var min = arr[0]

    var maxIndex = 0
    var minIndex = 0

    for (i in arr.indices) {
        if (arr[i] > max) {
            max = arr[i]
            maxIndex = i
        }

        if (arr[i] < min) {
            min = arr[i]
            minIndex = i
        }
    }

    println("Max value: $max, index: $maxIndex")
    println("Min value: $min, index: $minIndex")
}