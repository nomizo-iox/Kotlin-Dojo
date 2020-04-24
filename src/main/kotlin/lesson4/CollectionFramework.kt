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

    val ia : IntArray = intArrayOf(1, 2, 3 ,4)

    for (a in ia) { println(a) }

    val list = listOf<String>("Kotlin", "Java", "Python", "C++")
    for (a in list) { println(a) }

    val map = mapOf<Int, String>(1 to "Kotlin", 2 to "Java", 3 to "Python", 4 to "C++")
    for ((key, value) in map) {
        println("$key => $value")
    }

    for (i in 1..9) { print(i) }

    for (i in 1 until 10 step 2) { println(i) }

    for (i in 9 downTo 1 ) { println(i) }
}