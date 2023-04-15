package oop.inheritance.one

open class Vehicle(val name: String, val color: String) {

    open fun move() {
        println("$name is moving")
    }

    open fun stop() {
        println("$name has stopped")
    }

    override fun toString(): String {
        return "Vehicle(name='$name', color='$color')"
    }

}
