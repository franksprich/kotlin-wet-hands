package oop.challenge

/**
 * {DESCRIPTION}
 *
 * @author Frank Sprich
 */
class Person(var firstName: String, var lastName: String, var account: Account) {

    override fun toString(): String {
        return "Person(firstName='$firstName', lastName='$lastName', account=$account)"
    }
}
