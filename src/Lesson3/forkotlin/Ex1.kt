package Lesson3.forkotlin

fun main() {

    print("Enter number: ")
    var number = readln().toInt()

    val original = number
    var reversed = 0

    while (number > 0) {

        val digit = number % 10
        reversed = reversed * 10 + digit
        number /= 10
    }

    if (original == reversed) {
        println("Palindrome")
    } else {
        println("Not palindrome")
    }
}