package Lesson6.forkotlin

fun main() {

    // Массив строк
    val array = arrayOf("banana", "date", "apple", "cherry")

    for (i in array.indices) {

        for (j in 0 until array.size - 1 - i) {

            if (array[j].compareTo(array[j + 1]) > 0) {

                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }

    println(array.joinToString())
}
