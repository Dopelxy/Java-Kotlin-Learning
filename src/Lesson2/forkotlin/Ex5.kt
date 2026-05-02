package Lesson2.forkotlin

fun main() {

    println("Enter length: ")
    val length = readln().toDouble()
    println("Enter width: ")
    val width = readln().toDouble()
    val perimeter = (length + width) * 2
    val area = length * width
    println("The area is $area")
    println("The perimetr is $perimeter")
}
