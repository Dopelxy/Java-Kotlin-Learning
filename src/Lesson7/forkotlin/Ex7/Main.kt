package Lesson7.forkotlin.Ex7

fun main() {
    val circle = Circle(5.0)
    val rectangle = Rectangle(4.0, 6.0)

    circle.description()
    println("Круг, площадь: ${circle.area()} см")

    rectangle.description()
    println("Прямоугольник, площадь: ${rectangle.area()} см")

}