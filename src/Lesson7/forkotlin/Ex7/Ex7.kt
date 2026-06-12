package Lesson7.forkotlin.Ex7


abstract class Shape {
    abstract fun area(): Double

    fun description() {
        println("Это фигура")

    }
}

class Circle(private val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}
class Rectangle (private val width: Double,
                private val height: Double
) : Shape() {
    override fun area(): Double {
        return width * height
    }
}