package oop.inheritance.one

class Plain(name: String, color: String, val engines: Int, val doors: Int) : Vehicle(name, color) {

    override fun move() {
        println("$name is flying")
    }

    override fun stop() {
        println("$name has landed")
    }

    override fun toString(): String {
        return "Plain(name='$name', color='$color', engines=$engines, doors=$doors)"
    }

}
