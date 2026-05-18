package Lesson6.forkotlin

fun main() {
    val arr = intArrayOf(4, 3, 2, 1)

    val swaps = countMinSwaps(arr)

    println(swaps)
}

fun countMinSwaps(arr: IntArray): Int {
    var swaps = 0

    for (i in arr.indices) {
        var minIndex = i

        for (j in i + 1 until arr.size) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j
            }
        }

        if (minIndex != i) {
            val temp = arr[i]
            arr[i] = arr[minIndex]
            arr[minIndex] = temp

            swaps++
        }
    }

    return swaps
}