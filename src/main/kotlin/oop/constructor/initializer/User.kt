package oop.constructor.initializer

class User(name: String, private var lastName: String, private var age: Int) {

    var name: String

    // Initializer block
    init {
        if (name.startsWith('f', true)) {
            this.name = name
        } else {
            this.name = "User"
            println("The name $name does not start with the letter 'a' or 'A' using default name: ${this.name}")
        }
    }

    // Initializer block; multiple are allowed
    init {

    }

    override fun toString(): String {
        return "${User::class.simpleName}(name: $name, lastName: $lastName, age: $age)"
    }
}
