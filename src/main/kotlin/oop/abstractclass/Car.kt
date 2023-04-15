package oop.abstractclass

class Car(var name: String, var color: String, var engines: Int, var doors: Int) : Vehicle() {

    override fun move() {
        println("Move from Car")
    }

}
