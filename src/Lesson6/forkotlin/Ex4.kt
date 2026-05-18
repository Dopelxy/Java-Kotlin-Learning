package Lesson6.forkotlin

fun main() {
    val arr = intArrayOf(4, 2, 2, 8, 5, 6, 8, 5)

    val unique = IntArray(arr.size)
    var uniqueCount = 0

    for (i in arr.indices) {
        var alreadyExists = false

        for (j in 0 until uniqueCount) {
            if (arr[i] == unique[j]) {
                alreadyExists = true
                break
            }
        }

        if (!alreadyExists) {
            unique[uniqueCount] = arr[i]
            uniqueCount++
        }
    }

    for (i in 0 until uniqueCount) {
        for (j in 0 until uniqueCount - 1 - i) {
            if (unique[j] > unique[j + 1]) {
                val temp = unique[j]
                unique[j] = unique[j + 1]
                unique[j + 1] = temp
            }
        }
    }

    for (i in 0 until uniqueCount) {
        print("${unique[i]} ")
    }
}