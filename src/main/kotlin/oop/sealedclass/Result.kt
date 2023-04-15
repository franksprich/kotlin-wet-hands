package oop.sealedclass


sealed class Result(val message: String) {

    fun showMessage() {
        println("Result: $message")
    }

    class Success(message: String) : Result(message)
    class Error(message: String) : Result(message)
    class Progress(message: String) : Result(message)

}
