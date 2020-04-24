package main.kotlin.lesson2

// Unlike Java, functions in Kotlin can be defined outside a class.  This is called, Top Level Function
fun getGreeting(): String {
    return "Hello Kotlin"
}

// functions in Kotlin have Type Inference.  This function knows it is a string and does not need a return.
fun getAnotherGreeting() = "I feel silly for saying hi again"

fun sayHello() {
    println(getGreeting())
    println(getAnotherGreeting())
}

fun stopTheGreetings(itemToGreet: String) {
    val msg = "Hello" + itemToGreet
    println(msg)
}

// Can you string template instead of using the + symbol for concatenation
fun fuckYou(intro: String, responding: String) = println("$intro, $responding")

fun main() {
    println("Hello again")
    println(getGreeting())
    sayHello()
    stopTheGreetings("Newcomer")
    fuckYou("Hey Fucker!!!", "What did you say Bitch?")
}