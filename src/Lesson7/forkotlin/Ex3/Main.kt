package Lesson7.forkotlin.Ex3

fun main(){
    val account = BankAccount()

    // add amount
    account.deposit()
    println("Your balance: ${account.balance}")

    if (account.withdraw()){
        println("Withdrawal of  is successful")
        println("Your balance: ${account.balance}")
    } else {
        println("WARNING!! Insufficient funds to withdraw ")
    }


}