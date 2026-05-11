package Lesson5.forkotlin

fun isPalindrome(arr: IntArray): Boolean {

    var left = 0
    var right = arr.size - 1

    while (left < right) {

        if (arr[left] != arr[right]) {
            return false
        }

        left++
        right--
    }

    return true
}

fun main() {

    val arr = intArrayOf(1, 2, 3, 2, 1)

    println("Array: ${arr.joinToString()}")

    val result = isPalindrome(arr)

    println(
        if (result)
            "The array is a palindrome"
        else
            "The array is not a palindrome"
    )
}