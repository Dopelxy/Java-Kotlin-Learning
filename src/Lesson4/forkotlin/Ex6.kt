package Lesson4.forkotlin

fun main() {
    println("Enter the batch results")
    println("Number of batches: ")
    val n = readln().toInt()
    println("Enter information about the winners for the number of games played")
    val s = readln()

    var anton = 0
    var danik = 0

    for (ch in s) {
        if (ch == 'A') anton++
        else if (ch == 'D') danik++
    }

    if (anton > danik) {
        println("Anton")
    } else if (danik > anton) {
        println("Danik")
    } else {
        println("Friendship")
    }
}