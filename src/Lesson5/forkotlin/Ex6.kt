package Lesson5.forkotlin

fun arraysAreEqual(arr1: IntArray, arr2: IntArray): Boolean {

    if (arr1.size != arr2.size) {
        return false
    }

    for (i in arr1.indices) {

        if (arr1[i] != arr2[i]) {
            return false
        }
    }

    return true
}

fun main() {

    val arr1 = intArrayOf(1, 2, 3)
    val arr2 = intArrayOf(1, 2, 3)

    println("First array: ${arr1.joinToString()}")
    println("Second array: ${arr2.joinToString()}")

    val result = arraysAreEqual(arr1, arr2)

    println("Arrays are equal: $result")
}