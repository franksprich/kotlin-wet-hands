package oop.dataclass.concise


data class User(var firstName: String, var lastName: String, var age: Int) {

    //This property is excluded form equals, hashCode, toString methods
    var sex: String = "male"

}
