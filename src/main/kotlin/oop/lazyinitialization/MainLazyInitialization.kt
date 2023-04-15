package oop.lazyinitialization

fun main(args: Array<String>) {
    val user1 = User("Frank", "Sprich", 48)
    println(user1)

    val user2 by lazy {
        User("Hans", "Schmidt", 0)
    }
//    println(user2) // (LAZY) we will create the instance only because we print user2; without the println it will not be instantiated
}
