package Lesson3.forkotlin

fun main() {

    print("Enter height N: ")
    val n = readln().toInt()

    for (i in n downTo 1) {

        for (j in 1..i) {
            print("#")
        }
        println()
    }
}