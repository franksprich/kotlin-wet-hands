package oop.inheritance.two

open class Button(val text: String, val orientation: String) : View() {

    override fun draw() {
        //here is the code for creating the button
        println("Drawing the Button")
        super.draw()
    }

}
