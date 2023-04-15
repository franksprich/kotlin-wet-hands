package oop.singleton.newway

fun main(args: Array<String>) {
    val instanceNewWay1: Database = Database
    println("Instance $instanceNewWay1 retrieved (new way)")

    val instanceNewWay2: Database = Database
    println("Instance $instanceNewWay2 retrieved (new way)")
}
