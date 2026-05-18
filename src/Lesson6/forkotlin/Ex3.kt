package Lesson6.forkotlin

fun main() {

    // Исходный массив
    val arr = intArrayOf(4, 5, 6, 5, 4, 3)

    val frequencyMap = mutableMapOf<Int, Int>()


    for (num in arr) {

        frequencyMap[num] = frequencyMap.getOrDefault(num, 0) + 1
    }

    val sorted = arr.sortedWith(compareByDescending<Int> {

        frequencyMap[it]

    }.thenBy {

        it
    })

    println(sorted)
}