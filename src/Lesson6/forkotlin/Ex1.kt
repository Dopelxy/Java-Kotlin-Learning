package Lesson6.forkotlin

fun main(args: Array<String>) {
    //Original array
    val arr = intArrayOf(4, -3, 2, -1, 0, -5)
    // New array
    val result = IntArray(arr.size)

    var index = 0

    for (i in arr.indices) {
        if (arr[i] < 0){
            result [index] = arr[i]
            index++

        }
    }

    for (i in arr.indices) {
        if (arr[i] >= 0){
            result [index] = arr[i]
            index++
        }
    }
    println("Original array: ${arr.joinToString()}")
    println("New array: ${result.joinToString ()}")


}