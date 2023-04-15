package oop.inheritance.one

class Car(name: String, color: String, val engines: Int, val doors: Int) : Vehicle(name, color) {

    override fun move() {
        println("$name is driving")
    }

    override fun stop() {
        println("$name has parked")
    }

    override fun toString(): String {
        return "Car(name='$name', color='$color', engines=$engines, doors=$doors)"
    }

}
