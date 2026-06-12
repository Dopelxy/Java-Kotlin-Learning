package Lesson7.forkotlin.Ex6

interface Flyable {
    fun fly() //  без параметров

}

class Bird : Flyable {

    override fun fly() {
        println("Птица машет крыльями")
    }
}

class Airplane : Flyable {
    override fun fly() {
        println("Самолёт включает реактивные двигатели")
    }
}
