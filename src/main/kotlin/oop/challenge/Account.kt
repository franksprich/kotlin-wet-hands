package oop.challenge

class Account(private val accountName: String, private var balance: Double = 0.0) {

    private var transactions = mutableListOf<Double>()

    init {
        if (balance > 0.0) {
            transactions.add(balance)
            println("Created account with ${this.balance}")
        }
    }

    fun deposit(amount: Double) {
        if (amount > 0) {
            transactions.add(amount)
            this.balance += amount
            println("$amount deposited. Balance is now ${this.balance}")
        } else {
            println("Cannot deposit negative amounts")
        }
    }

    fun withdraw(withdraw: Double) {
        if (-withdraw < 0) {
            transactions.add(-withdraw)
            this.balance += -withdraw
            println("$withdraw withdrawn. Balance is now ${this.balance}")
        } else {
            println("Cannot withdraw negative amounts")
        }
    }

    fun calculateBalance(): Double {
        this.balance = 0.0
        for (transaction in transactions) {
            this.balance += transaction
        }
        return balance
    }

    override fun toString(): String {
        return "Account(accountName='$accountName', balance=$balance, transactions=$transactions)"
    }

}
