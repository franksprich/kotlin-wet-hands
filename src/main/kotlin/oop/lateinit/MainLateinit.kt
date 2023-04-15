package oop.lateinit

fun main() {
    val user = User("Frank", "Sprich", 48)
    user.favoriteMovie = "Interstellar"
    println("$user") // without initialize favoriteMovie (lateinit), this leads to an ERROR
    println("ATTENTION: lateinit does not work on primitive data types like Int")
}
