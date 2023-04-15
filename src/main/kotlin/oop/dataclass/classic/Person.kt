package oop.dataclass.old

/**
 * {DESCRIPTION}
 *
 * @author Frank Sprich
 */
class Person(var name: String) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Person

        return name == other.name
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun toString(): String {
        return "Person(name='$name')"
    }


}
