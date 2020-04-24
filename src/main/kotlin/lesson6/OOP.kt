package main.kotlin.lesson6

import main.kotlin.lesson1.age

fun main() {

    val p1 = Person1()
    println("My name is ${p1.firstName} ${p1.lastName}, and I am ${p1.age} years old")

    val p2 = Person2()
    p2.age = 29
    p2.firstName = "Abraham"
    p2.lastName = "Ademola"
    println("My name is ${p2.firstName} ${p2.lastName}, and I am ${p2.age} years old")

    val p4 = Person4(firstName = "Samuel", lastName = "Ademola", age = 32)
    println("${p4.fullName} is age $age")

    val p5 = Person4(year = 35)
    p5.firstName = "Samuel"
    p5.lastName = "Ademola"
    println("My name is ${p5.firstName} ${p5.lastName}, and I am ${p5.age} years old")
}