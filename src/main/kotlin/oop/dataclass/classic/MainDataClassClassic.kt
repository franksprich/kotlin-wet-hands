package oop.dataclass.classic

fun main(args: Array<String>) {
    val name1 = "Frank"
    val name2 = "Frank"
    println("Structural equality (==): ${name1 == name2}")
    // Bad example to use String here as type because of the special treatment of String in memory
    println("Referential equality (===) on String: ${name1 === name2}")

    println()
    val person1 = Person("Frank")
    val person2 = Person("Frank")
    println("Structural equality (==) on Person: ${person1 == person2} - does only work with correct implemented equals and hashCode methods")
    println("Referential equality (===) on Person: ${person1 === person2}")


    println()
    val user1 = User("Frank", "Sprich", 48)
    val user2 = User("Frank", "Sprich", 48)
    println("Structural equality (==) ${user1 == user2}")
    println("Referential equality (==) ${user1 == user1}")
    println("Referential equality (==) ${user1 == user2}")
}
