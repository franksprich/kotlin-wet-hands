package oop.accessors

fun main() {
    val user = User("Frank", "Sprich", 48)
    println(user)

    // Getter
    println("(Getter) FirstName: ${user.firstName}")
    println("(Getter) LastName: ${user.lastName}")
    println("(Getter) Age: ${user.age}")

    // Setter
    user.firstName = "Harald"
    user.lastName = "Schmidt"
    user.age = 72

    println("(Getter) FirstName: ${user.firstName}")
    println("(Getter) LastName: ${user.lastName}")
    println("(Getter) Age: ${user.age}")

}
