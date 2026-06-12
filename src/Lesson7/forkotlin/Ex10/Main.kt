package Lesson7.forkotlin.Ex10

fun main() {
    val dev1 = Developer("Анна", 80000.0, 15000.0)
    val dev2 = Developer("Иван", 90000.0, 20000.0)
    val man1 = Manager("Ольга", 100000.0, 5)

    println(dev1.info())
    println(dev2.info())
    println(man1.info())
}