package Lesson5.forkotlin

fun reverseArray(arr: IntArray) {

    var left = 0
    var right = arr.size - 1

    while (left < right) {

        val temp = arr[left]
        arr[left] = arr[right]
        arr[right] = temp

        left++
        right--
    }
}

fun main() {

    val arr = intArrayOf(1, 2, 3, 4, 5)

    println("Original array: ${arr.joinToString()}")

    reverseArray(arr)

    println("Reversed array: ${arr.joinToString()}")
}