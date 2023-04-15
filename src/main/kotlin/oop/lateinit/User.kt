package oop.lateinit


class User(var firstName: String, var lastName: String, var age: Int) {

    lateinit var favoriteMovie: String

    override fun toString(): String {
        return "User(firstName='$firstName', lastName='$lastName', age=$age, favoriteMovie: '$favoriteMovie')"
    }
}
