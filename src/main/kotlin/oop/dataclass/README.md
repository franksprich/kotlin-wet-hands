Link: [DataClasses](https://www.youtube.com/watch?v=EExSSotojVI)

In Kotlin, a data class is a special class that is primarily designed to hold data. 
It is commonly used to represent simple data structures like a record or a row in a database table.

To define a data class in Kotlin, you can use the "data" keyword before the class declaration. 
The properties of a data class are automatically generated, including implementations of 
`equals()`, `hashCode()`, `toString()`, and `copy()` methods.

For example, the following code defines a simple data class named "Person" with two properties: "name" and "age":

```kotlin
data class Person(val name: String, val age: Int)
```
With this definition, you can create instances of the Person class and access its properties:

```kotlin
val person = Person("John", 30)
println(person.name) // prints "John"
println(person.age) // prints 30
```
The `equals()`, `hashCode()`, `toString()`, and `copy()` methods are automatically generated based on the properties defined in the class. This allows you to compare instances of the class, create copies of the instances, and print them out in a meaningful way.
