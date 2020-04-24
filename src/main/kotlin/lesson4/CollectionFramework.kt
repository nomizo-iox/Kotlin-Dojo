package main.kotlin.lesson4

fun greeting(intro: String, responding: String) = println("$intro, $responding")

fun main() {
    val interestingThings = arrayOf("Kotlin", "Programming", "comic-Books")
    println(interestingThings.size)
    println(interestingThings[1])

    // ForLoop way of printing an array
    for (interestingThing in interestingThings) {
        println(interestingThing)
    }

    // Functional way of print an array : This way, we lose the index
    interestingThings.forEach { println(it)  }

    // Lambda way of printing an array : This way, we lose the index
    interestingThings.forEach { interestingThing -> println(interestingThing) }

    interestingThings.forEachIndexed { index, interestingThing -> println("$interestingThing is at $index") }
}