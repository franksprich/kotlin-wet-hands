package oop.companionobject

fun main() {
    val calculator = Calculator()
    val result = calculator.sum(3, 6)
    println(result)

    // No need to create the object Calculator first
    println(Calculator.substract(9, 4))

    println(Calculator.max)
    val max = Int.MAX_VALUE
}
