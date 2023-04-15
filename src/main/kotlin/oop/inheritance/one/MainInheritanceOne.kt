package oop.inheritance.one

fun main(args: Array<String>) {
    val car = Car("BMW", "grey", 1, 4)
    println(car)
    car.move()
    car.stop()

    val plain = Plain("Airbus", "white", 4, 12)
    println(plain)
    plain.move()
    plain.stop()
}
