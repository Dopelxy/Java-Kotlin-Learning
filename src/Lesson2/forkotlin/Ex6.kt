package Lesson2.forkotlin

fun main (){

    println("Enter score: ")
    val score = readln().toInt()
    if (score >=90){
        println("Grade - A")
    } else if (score >=75){
        println("Grade - B")
    } else if (score >=50){
        println("Grade - C")
    } else if (score >=30){
        println("Grade - D")
    } else {
        println("Grade - F")
    }

}