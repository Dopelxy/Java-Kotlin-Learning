package Lesson7.forkotlin.Ex10

abstract class Employee(
    val name: String,
    private val id: Int = generateId()   // id генерируется автоматически
) {
    companion object {
        private var lastId = 0
        private fun generateId(): Int {
            lastId++
            return lastId
        }
    }

    abstract fun calculateSalary(): Double

    fun info(): String {
        return "[$id] $name, зарплата: ${calculateSalary()}"
    }
}

class Developer(
    name: String,
    private val baseSalary: Double,
    private val bonus: Double
) : Employee(name) {
    override fun calculateSalary(): Double {
        return baseSalary + bonus
    }
}

class Manager(
    name: String,
    private val baseSalary: Double,
    private val teamSize: Int
) : Employee(name) {
    override fun calculateSalary(): Double {
        return baseSalary + teamSize * 500.0
    }
}