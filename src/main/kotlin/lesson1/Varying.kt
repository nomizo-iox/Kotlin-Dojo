package main.kotlin.lesson1

// Kotlin has a non-null Types, where as Java can have a null Type (String).
// Will need to have a question mark to make it accept null

val name: String = "Samuel"
var greeting: String = "Hello"
var address: String? = null

var age = 32


fun main() {

    // When in Kotlin is the same as Switch in Java
    greeting = "How do you do?"
    when(greeting) {
        null -> println("I am fine.")
        else -> println("Why are you talking to me?")
    }

    val greetingToPrint = if (greeting != null) greeting else "Hi"
    println(greetingToPrint)

    val anotherGreetingToPrint = when (greeting) {
        null -> "hi"
        else -> "What are you looking at?"
    }
    println(anotherGreetingToPrint)

    println(age)
}