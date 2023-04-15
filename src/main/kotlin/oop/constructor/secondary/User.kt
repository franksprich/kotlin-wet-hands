package oop.constructor.secondary

class User(var name: String, var lastName: String, var age: Int) {

    constructor(name: String): this(name, "PLACEHOLDER", 0) {
        this.lastName = "Secondary1"
        this.age = 33
    }

    constructor(name: String, lastName: String): this(name, lastName, 0) {
        this.lastName = "Secondary2"
        this.age = 33
    }

    override fun toString(): String {
        return "User(name: $name, lastName: $lastName, age: $age"
    }

}
