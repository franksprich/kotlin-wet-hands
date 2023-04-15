package oop.dataclass.concise

fun main(args: Array<String>) {
    val user1 = User("Frank", "Sprich", 48)
    val user2 = User("Frank", "Sprich", 48)

    println("user1 == user2: ${user1 == user2}")
    println("user1: $user1")
    println("user2: $user2")
}
