fun main() {
    loopChallenge()
//    nestedWhileLoop()
//    forLoopWithBreak()
//    forLoopWithContinue()
//    whileLoopWithBreak()
//    whileLoopWithContinue()
//    doWhileLoop()
//    whileLoop()
//    forLoop()
//    forLoopArbitraryStep()
//    forLoopBackwards()
//    forLoopUntil()
//    forLoopRange()
}

fun loopChallenge() {
    var count = 0
    val lower = 0
    val upper = 20
    for (i in lower..upper) {
        if (isEvenNumber(i)) {
            count++
            println("i = $i")
        }
    }
    println("Even numbers found: $count")
}

fun isEvenNumber(number: Int) = number % 2 == 0

fun nestedWhileLoop() {
    var number = 0
    outer@ while (number < 6) {
        println("number = ${number++}")
        var i = 0
        inner@ while (i < 6) {
            if (number - i == 0) {
                continue@outer
            }
            println(" -> i = ${i++}")
        }
    }
}

fun forLoopWithBreak() {
    for (i in 0..10) {
        if (i == 6) break
        println("i = $i")
    }
}

fun forLoopWithContinue() {
    for (i in 0..10) {
        if (i in 3..8) continue
        println("i = $i")
    }

}

fun whileLoopWithBreak() {
    var x = 0
    while (x < 10) {
        if (x == 7) {
            break
        }
        println("x = ${x++}")
    }
}

fun whileLoopWithContinue() {
    var x = 0
    while (x < 10) {
        if (x == 7) {
            x++
            continue
        }
        if (x in 3..5) {
            x++
            continue
        }
        println("x = ${x++}")
    }
}

fun doWhileLoop() {
    var x = 10
    do {
        println("x = $x--")
    } while (x < 10)
}

fun whileLoop() {
    var x = 10
    while (x != 0) {
        println("x = ${x--}")
    }
}

fun forLoop() {
    for (i in 1..10) {
        println("i = $i")
    }
}

fun forLoopArbitraryStep() { // with arbitrary step
    for (i in 1 until 10 step 2) {
        println("i = $i")
    }
}

fun forLoopBackwards() { // can only count backwards
    for (i in 10 downTo 1) {
        println("i = $i")
    }
}

fun forLoopUntil() {
    for (i in 1 until 10) { // excludes the 10; can only count upwards
        println("i = $i")
    }
}

fun forLoopRange() {
    for (i in 1..10) { // includes the 10; can only count upwards
        println("i = $i")
    }
}

//fun main() {
//    println(" ${sum(5, 6, 7, 8)}")
//    println("${sumVarargs(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)}")
//    printAll(1, 2, 3, 4, 5, 6)
//}

fun printAll(vararg numbers: Int) {
    numbers.forEach { println(it) }
}

fun sum(a: Int, b: Int, c: Int, d: Int) = a + b + c + d

fun sumVarargs(vararg numbers: Int): Int {
    var result = 0
    for (num in numbers) {
        result += num
    }
    return result
}

//fun main(args: Array<String>) {
//    withDefaultParameter("Frank", "how are your?")
//    withDefaultParameter("Frank")
//    withDefaultParameter()
//    withDefaultParameter(message = "what will your do?")
//    withDefaultParameter(
//        message = "what's up?",
//        name = "Hanna"
//    )
//    withDefaultParameterFromFunction()
//}

fun withDefaultParameterFromFunction(name: String = "User", message: String = defaultMessage()) {
    println("name: $name, message: $message")
}

fun defaultMessage(): String = "default from a function"

fun withDefaultParameter(name: String = "User", message: String = "are your fine?") {
    println("name: $name, message: $message")
}

//fun main(args: Array<String>) {
//////    maxSingleExpression(1,2)
//////    maxSingleExpression(1.0, 2.0)
//////    nullValue()
//////    whenStatement()
//////    logicalOperator()
//////    ifThenElse()
//////    operators()
//////    charAndBooleanType()
//////    floatAndDoubleType()
//////    integerTypes()
//////    variables()
////
////    // Try adding program arguments via Run/Debug configuration.
////    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
////    // println("Program arguments: ${args.joinToString()}")
//}

/**
 * Use only if your function has a single line of code
 */
fun maxSingleExpression(a: Int, b: Int): String = "ha" //if (a > b) a else b

/* Override methods by type or number of parameters; ONLY CHANGE RETURN TYPE does not work */
fun maxSingleExpression(a: Double, b: Double): String = "ba" //if (a > b) a else b
fun maxSingleExpression(a: Double, b: Double, c: String) = if (a > b) a else b

fun max(a: Int, b: Int): Int {
//    if (a > b) return a
//    return b

    return if (a > b) a else b
}

fun sayHello(name: String, anotherName: String) {
    println("Hello, $name $anotherName")
}

fun nullValue() {
    var text: String? = "Name" // = null
    println("Text length: ${text?.length}")
    println("Text length: ${text!!.length}") // leads to NullPointerException when text is null

    text = "thing"
    val text2 =
        text ?: "The variable is null"  // Elvis operator meaning that if text is null take the other text instead
    println("Text2: $text2")
}

fun whenStatement() {
    val alarm = 20
    when (alarm) {
//        12, -> println("when: The time is $alarm")
//        7 -> println("when: The time is $alarm")
//        14 -> println("when: The time is $alarm")
        !in 1..10 -> {
            println("The number is not in the range 1..10: $alarm")
            println("The second line of code")
        }

        in 1..10 -> println("The number is in the range 1..10: $alarm") // matching range
        11, 12, 13 -> println("The number is: $alarm") // matching specific number

        else -> println("The number is $alarm") // or else
    }

    val number: Int = 9
    val text = when (number) {
        in 1..10 -> "is in range 1..10"
        in 11..20 -> {
            println("Only the last statement will be returned")
            "is in range 11..20"
        }

        else -> "is not in any know range"
    }
    println("The number $text")

    val text2 = when {
        number <= 10 -> "number: $number is less then 10"
        else -> "else branch"
    }
    println("The $text2")

}

fun logicalOperator() {
    val isPlaying = true
    val score = 80
    if (isPlaying && score > 30) {
        println("isPlaying is true and the score is greater than 30")
    }

    if (isPlaying || score > 30) {
        println("isPlaying is true or the score is greater than 30")
    }

    val num1 = 5
    val num2 = -4
    val text = if (num1 > 0 || num2 > 0) {
        println("The condition is true")
        "This is text 1"
    } else {
        println("The condition is false")
        "This is text 2"
    }
    println("$text")
}

fun ifThenElse() {
    val isActive = true
    if (isActive == true) {
        println("it is active")
    } else {
        println("it is NOT active")
    }

    val myNumber = 100
    if (myNumber > 150) {
        println("myNumber is greater")
    } else {
        println("myNumber is less")
    }

    if (myNumber >= 101) {
        println("is greater or equal to 100")
    } else {
        println("is NOT greater or equal to 100")
    }
}

fun operators() {
    var x = 5
    val y = 3.0

    var result = x + y
    println("Result: $result")
    println("x is $x and y is $y")
    println("(x + y): ${x + y}")
    println("(x - y): ${x - y}")
    println("(x * y): ${x * y}")
    println("(x / y): ${x / y}")
    println("(x % y): ${x % y} modulus")

    result = result + 2
    println("New result: $result")
}

fun charAndBooleanType() {
    val myChar: Char = 'a'
    val myBoolean: Boolean = true
    println("myChar: $myChar myBoolean: $myBoolean")
}

fun floatAndDoubleType() {
    val myFloat = 2.5F
    val myDouble = 2.5
    println("myFloat: $myFloat and myDouble: $myDouble")

    val maxFloat: Float = Float.MAX_VALUE
    val minFloat: Float = Float.MIN_VALUE
    println("Float max: $maxFloat min: $minFloat")

    val maxDouble: Double = Double.MAX_VALUE
    val minDouble: Double = Double.MIN_VALUE
    println("Double max: $maxDouble min: $minDouble")
}

fun integerTypes() {
    val maxByteValue: Byte = Byte.MAX_VALUE
    val minByteValue: Byte = Byte.MIN_VALUE
    println("Byte max: $maxByteValue min: $minByteValue")

    val maxShortValue: Short = Short.MAX_VALUE
    val minShortValue: Short = Short.MIN_VALUE
    println("Short max: $maxShortValue min: $minShortValue")

    val maxIntegerValue: Int = Int.MAX_VALUE
    val minIntegerValue: Int = Int.MIN_VALUE
    println("Int max: $maxIntegerValue min: $minIntegerValue")

    val maxLongValue: Long = Long.MAX_VALUE
    val minLongValue: Long = Long.MIN_VALUE
    println("Long max: $maxLongValue min: $minLongValue")

    val myNumber = 2147483648
}

fun variables() {
    val userName: String = "Frank"

    var age: Int = 22
    age = 25

    println("Hello $userName, age: $age!")
}
