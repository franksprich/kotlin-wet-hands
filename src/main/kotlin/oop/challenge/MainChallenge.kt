package oop.challenge

fun main(args: Array<String>) {
    val account = Account("1234", 5000.0)
    account.deposit(1000.0)
    account.withdraw(12.0)
    account.withdraw(57.0)
    println("Calculated balance: ${account.calculateBalance()}")
    println(account)
    println()
    val frank = Person("Frank", "Sprich", account)
    println(frank)
}
