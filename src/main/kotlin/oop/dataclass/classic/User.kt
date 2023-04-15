package oop.dataclass.old

/**
 * {DESCRIPTION}
 *
 * @author Frank Sprich
 */
class User(var firstNasme: String, var lastName: String, var age: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (firstNasme != other.firstNasme) return false
        if (lastName != other.lastName) return false
        return age == other.age
    }

    override fun hashCode(): Int {
        var result = firstNasme.hashCode()
        result = 31 * result + lastName.hashCode()
        result = 31 * result + age
        return result
    }

    override fun toString(): String {
        return "User(firstNasme='$firstNasme', lastName='$lastName', age=$age)"
    }


}
