fun main(args: Array<String>) {
//    arraysAndIsCheck()
    val aut = arrayOf(1,2,3,5,8,2,0,2,56,88,66,-22)
    println("The maximum number in the array is ${findMax(aut)}")
    println("The minimum number in the array is ${findMin(aut)}")
    println("The min or max number in the array is ${findMinOrMax(aut, findMax = true)}")
    println("The min or max number in the array is ${findMinOrMax(aut, findMax = false)}")
}

fun findMinOrMax(integers: Array<Int>, findMax: Boolean): Int {
    var result = integers[0]
    if (findMax) {
        for (num in integers) {
            if (num > result) result = num
        }
    } else {
        for (num in integers) {
            if (num < result) result = num
        }
    }
    return result

}

fun findMax(integers: Array<Int>): Int {
    var max = integers[0]
    for (num in integers) {
        if (num > max) max = num
    }
    return max
}

fun findMin(integers: Array<Int>): Int {
    var min = integers[0]
    for (num in integers) {
        if (num < min) min = num
    }
    return min
}

fun arraysAndIsCheck() {
    val names: Array<String> = arrayOf("One", "Two", "Three")
    for (name in names) {
        println("name is $name")
    }

    val others = arrayOf("Four", "Five", "Six")
    for (other in others) {
        println("other is $other")
    }
    println("Second element of others: ${others[1]}")
    others[1] = "Lorem"
    println("New second element of others: ${others[1]}")
    println("Length of the array: ${others.size}")

    val items = arrayOf(1, 2, 3, 4, 5, 6, "Fourteen", 'a')
    for (item in items) {
//        if (item is Int) { // print only the Int from the array items
//            println("Item is $item")
//        }
//        if (item is String) { // print only the String from the array items
//            println("Item is $item")
//        }
        if (item is Char) { // print only the Char from the array items
            println("Item is $item")
        }
    }
}
