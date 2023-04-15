package oop.lazyinitialization


class User(var firstName: String, var lastName: String, var age: Int) {

    init {
        println("User: $firstName was created")
    }

    override fun toString(): String {
        return "User(firstName='$firstName', lastName='$lastName', age=$age)"
    }
}
