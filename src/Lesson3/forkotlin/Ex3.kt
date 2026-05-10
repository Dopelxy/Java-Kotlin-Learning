package Lesson3.forkotlin

fun main() {

    print("Enter number: ")
    var number = readln().toInt()

    while (number >= 10) {

        var sumNumber = 0

        while (number > 0) {

            val digit = number % 10
            sumNumber += digit
            number /= 10
        }
        number = sumNumber
    }
    println("Result: $number")
}
