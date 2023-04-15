package oop.enumclasses

enum class Direction(var direction: String, var distance: Int) {
    NORTH("north", 10),
    SOUTH("south", 20),
    EAST("east", 15),
    WEST("west", 40);

    fun printData() {
        println("PrintData says: More Direction = $direction than distance: $distance")
    }

//    override fun toString(): String {
//        return "Direction(direction='$direction', distance=$distance)"
//    }


}
