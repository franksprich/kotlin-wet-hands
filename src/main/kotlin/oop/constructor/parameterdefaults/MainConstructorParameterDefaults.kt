package oop.constructor.parameterdefaults

fun main() {
    val user1 = User("Frank")
    println(user1)

    val user2 = User(age = 49, lastName = "Smith", firstName = "John")
    println(user2)
}
