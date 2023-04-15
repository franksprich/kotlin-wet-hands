package oop.constructor.parameterdefaults

class User(var firstName: String, var lastName: String = "Sprich", var age: Int = 48) {

    override fun toString(): String {
        return "User(firstName='$firstName', lastName='$lastName', age=$age)"
    }
}
