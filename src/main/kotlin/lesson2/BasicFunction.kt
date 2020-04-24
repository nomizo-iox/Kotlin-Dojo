package main.kotlin.lesson2


fun getGreeting(): String {
    return "Hello Kotlin"
}

fun sayHello() {
    println(getGreeting())
}

fun main() {
    println("Hello again")
    println(getGreeting())
    sayHello()
}