package main.kotlin.lesson6

// Kotlin way of creating a Constructor
class Person4 constructor(var firstName: String ="", var lastName: String ="", var age: Int = 0) {

    // Custom Getter
    val fullName: String
        get() = "$firstName $lastName"

    // Secondary Constructor must be delegated to the Primary Constructor at the top
    constructor(year: Int) : this() {
        age += year
    }

}