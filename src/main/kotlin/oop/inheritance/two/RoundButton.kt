package oop.inheritance.two

/**
 * corners are the degrees of the round corners
 */
class RoundButton(text: String, orientation: String, val corners: Int) : Button(text, orientation) {

    override fun draw() {
        //here is the code for creating the round button
        println("Drawing the RoundButton")
        super.draw()
    }

}
