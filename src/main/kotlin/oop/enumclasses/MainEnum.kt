package oop.enumclasses

fun main(args: Array<String>) {
    println("One direction: ${Direction.NORTH}")

    // Iterate all enum values
    println("Iterate all directions:")
    for (direction in Direction.values()) {
        println(direction)
    }

    // Access enum properties and functions
    println("Access properties of Enum value: ${Direction.WEST.direction}")
    println(Direction.NORTH.printData())

    // Using enum in when statement
    val direction: Direction = Direction.valueOf("east".uppercase())
    when(direction) {
        Direction.EAST -> println("The direction is: Ost")
        Direction.WEST -> println("The direction is: West")
        Direction.NORTH -> println("The direction is: Nord")
        Direction.SOUTH -> println("The direction is: Süd")
        else -> {
            println("ELSE")
        }
    }
}
