
Link: [Enum](https://www.youtube.com/watch?v=EExSSotojVI&t=26702s)

In Kotlin, an enum class is a special type of class that represents a group of related constants. 
It is a convenient way to define a fixed set of values that can be used throughout your code.

To define an enum class in Kotlin, you can use the "enum class" keyword followed by the name of the enum 
and its values. Each value in the enum is separated by a comma.

For example, the following code defines an enum class named "Color" with three values: RED, GREEN, and BLUE:

```kotlin
enum class Color {
    RED, GREEN, BLUE
}
```
With this definition, you can use the values of the Color enum throughout your code:

```kotlin
val myColor = Color.GREEN
```
You can also define properties and methods on an enum class, just like you can with a regular class. For example, the following code defines an enum class named "Planet" with a property named "mass" and a method named "surfaceGravity":

```kotlin
enum class Planet(val mass: Double, val radius: Double) {
    EARTH(5.97e24, 6_371_000.0),
    MARS(6.39e23, 3_389_500.0);

    fun surfaceGravity(): Double {
        return GRAVITATIONAL_CONSTANT * mass / (radius * radius)
    }

    companion object {
        const val GRAVITATIONAL_CONSTANT = 6.67e-11
    }
}
```
With this definition, you can use the values of the Planet enum and call its methods:

```kotlin
val earth = Planet.EARTH
println("Surface gravity on ${earth.name} is ${earth.surfaceGravity()} m/s^2")
```
Overall, enum classes in Kotlin provide a convenient and type-safe way to represent a fixed set of values, allowing for better code readability and maintainability.
