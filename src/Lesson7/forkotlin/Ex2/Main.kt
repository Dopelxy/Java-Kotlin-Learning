package Lesson7.forkotlin.Ex2

fun main() {

    // Создание через основной конструктор
    val dog1 = Dog("Bobik", 3)

    val dog2 = Dog("Bibik", 5)

    // Создание через дополнительный конструктор
    val dog3 = Dog("T-rex")

    val dog4 = Dog("2zik")

    // Вывод информации
    dog1.info()

    dog2.info()

    dog3.info()

    dog4.info()
}