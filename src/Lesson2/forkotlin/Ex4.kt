package Lesson2.forkotlin

fun main() {

    var number: Int

    do {
        println("Enter number")
        number = readln().toInt()
        println("You enter number: $number")
    } while (number >= 0)
}


