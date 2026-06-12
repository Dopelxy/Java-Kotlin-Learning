package Lesson7.forkotlin.Ex3

class BankAccount {
    var balance: Double = 0.0  // balance account

    fun deposit() { // add amount
        print("Enter the amount:")
        val amount = readln().toDouble()
        balance += amount
        logTransaction("deposit: ", amount)
    }

    fun withdraw(): Boolean { //withdraw the amount
        print("Enter the withdrawal amount:")
        val amount = readln().toDouble()
        if (balance >= amount) {
            balance -= amount
            logTransaction("withdraw: ", amount)
            return true

        } else {
            return false  // insufficient funds (недостаточно средств)
        }
    }

    private fun logTransaction(type: String, amount: Double) {
        println("Operation: $type, $amount")
    }
}