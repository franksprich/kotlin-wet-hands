package oop.constructor.secondary

fun main() {
    val userPrimaryConstructor = User("Frank", "Sprich", 48)
    println(userPrimaryConstructor)

    val userSecondaryConstructor1 = User("Frank")
    println(userSecondaryConstructor1)

    val userSecondaryConstructor2 = User("Frank", "Sprich")
    println(userSecondaryConstructor2)
}
