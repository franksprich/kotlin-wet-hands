package oop.constructor.primary

fun main() {
    val car1 = Car("   Tesla  ", "S Plaid", "red", 2)
//    car1.name = "Tesla"
//    car1.model = "S Plaid"
    car1.color = "green"
//    car1.doors = 2

    car1.move()
    println(car1)
    car1.stop()

    val car2 = Car("BMW", "X6M", "grey", 4)
//    car2.name = "BMW"
//    car2.model = "X6M"
//    car2.color = "grey"
//    car2.doors = 4

    car2.move()
    println(car2)
    car2.stop()
}
