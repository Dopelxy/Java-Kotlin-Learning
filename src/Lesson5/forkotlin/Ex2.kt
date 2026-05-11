package Lesson5.forkotlin


fun main() {

    val numbers = intArrayOf(5, 2, 9, 1, 7, 40)

    var evenCount = 0
    var oddCount = 0

    for (number in numbers) {
        if (number % 2 == 0) {
            evenCount++
        } else {
            oddCount++
        }
    }

    println("Array: ${numbers.contentToString()}")
    println("Even numbers: $evenCount")
    println("Odd numbers: $oddCount")
}
