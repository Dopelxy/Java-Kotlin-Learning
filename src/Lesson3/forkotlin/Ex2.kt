package Lesson3.forkotlin

fun main() {

    print("Enter number: ")
    val number = readln().toInt()

    var isPrime = true

    if (number <= 1) {
        isPrime = false
    } else {

        for (i in 2 until number) {

            if (number % i == 0) {
                isPrime = false
                break
            }
        }
    }

    if (isPrime) {
        println("Prime number")
    } else {
        println("Not prime number")
    }
}