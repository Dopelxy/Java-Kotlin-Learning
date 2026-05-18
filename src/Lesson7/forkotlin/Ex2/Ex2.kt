package Lesson7.forkotlin.Ex2

class Dog(

    // Основной конструктор
    val name: String,
    val age: Int
) {

    // Дополнительный конструктор
    constructor(name: String) : this(name, 0)

    // Метод вывода информации
    fun info() {

        println("name: $name, age: $age")
    }
}