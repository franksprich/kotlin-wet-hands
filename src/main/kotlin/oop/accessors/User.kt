package oop.accessors

class User(firstName: String, lastName: String = "Sprich", var age: Int = 48) {

    // Accessors could be overridden:
    var firstName = firstName
        get() {
            return "(using getter) $field"
        }
        set(value) {

            field = "(using setter): $value"
        }
    // Accessors are implicit; below is the explicit default implementation:
    var lastName = lastName
        get() {
            return field
        }
        set(value) {
            field = value
        }



    override fun toString(): String {
        return "User(firstName='$firstName', lastName='$lastName', age=$age)"
    }
}
