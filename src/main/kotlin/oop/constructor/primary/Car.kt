package oop.constructor.primary

class Car(name: String, private var model: String, var color: String, doors: Int) {
    private var name = name.trim()
    private var doors = doors

    fun move() {
        println("Car $name is moving")
    }

    fun stop() {
        println("Car $name has stopped")
    }

    override fun toString(): String {
        return "${Car::class.simpleName}(name: $name, model: $model, color: $color, doors: $doors)"
    }
}
