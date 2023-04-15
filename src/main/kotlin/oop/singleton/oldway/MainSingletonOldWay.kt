package oop.singleton.oldway

fun main(args: Array<String>) {
    val instanceOldWay1: Database? = Database.getInstance()
    println("Instance $instanceOldWay1 retrieved (old way)")

    val instanceOldWay2: Database? = Database.getInstance()
    println("Instance $instanceOldWay2 retrieved (old way)")

}
