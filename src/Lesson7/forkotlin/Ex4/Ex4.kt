package Lesson7.forkotlin.Ex4

class Counter {   // счётчик
    companion object {
        private var totalCount: Int = 0

        fun getTotal(): Int {
            return totalCount
        }

    }

    init {
        totalCount++
    }

}