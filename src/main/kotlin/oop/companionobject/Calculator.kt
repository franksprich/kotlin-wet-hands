package oop.companionobject

class Calculator {

    // Static method in Java
    companion object {
        var max = 200
        fun substract(a: Int, b: Int): Int {
            return a - b
        }
    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }
}
