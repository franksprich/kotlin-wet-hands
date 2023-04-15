Links: 
 * [Interfaces1](https://www.youtube.com/watch?v=EExSSotojVI&t=33833s)
 * [Interfaces2](https://www.youtube.com/watch?v=EExSSotojVI&t=33833s)


In Kotlin, an interface is a blueprint of a class that defines a set of abstract methods and properties that a class must implement. 
It is a key feature of object-oriented programming, allowing for abstraction and polymorphism.

To define an interface in Kotlin, you can use the "interface" keyword followed by the name of the interface and its methods and properties. Unlike classes, interfaces cannot hold state, but they can have default implementations of methods.

For example, the following code defines a simple interface named "Drawable" with a single abstract method named "draw":

```kotlin
interface Drawable {
    fun draw()
}
```
With this definition, you can create classes that implement the Drawable interface and provide their own implementation of the draw() method:

```kotlin
class Circle : Drawable {
    override fun draw() {
        println("Drawing a circle")
    }
}


class Square : Drawable {
    override fun draw() {
        println("Drawing a square")
    }
}
```
Note that the classes that implement the Drawable interface must provide an implementation for the draw() method, otherwise, the compiler will produce an error. Also, note that the implementation of the method must use the "override" keyword to indicate that it is overriding the abstract method of the interface.

Interfaces in Kotlin can also have default implementations of methods, which can be overridden by classes that implement the interface if needed. This allows for better code reuse and reduces boilerplate code.

Overall, interfaces in Kotlin provide a powerful mechanism for defining contracts between classes, allowing for abstraction and polymorphism.
