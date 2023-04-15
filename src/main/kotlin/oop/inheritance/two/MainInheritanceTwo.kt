package oop.inheritance.two

fun main(args: Array<String>) {
    val view = View()
    val button = Button("Login", "Center")
    val roundButton = RoundButton("Sign Up", "Center", 33)

    view.draw()
    println()
    button.draw()
    println()
    roundButton.draw()
}
