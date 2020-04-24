package main.kotlin.lesson3


fun main() {
    println("What is your age?: ")
    val age = Integer.valueOf(readLine())
    // Regular if-statement style
    if (age >= 21) println("You are allowed to drink")
    else println("You are not allowed to drink!")

    // Kotlin way
    val result = if (age >= 21) "Welcome to club Rouge" else "You shall not pass"
    println(result)

    // Kotlin When statement version 1
    println("What day is it today?")
    val day = readLine()
    when (day) {
        "Monday" -> println("Chicken")
        "Friday" -> println("Salmon")
        "Sunday" -> println("Steak")
        else -> println("Pork")
    }

    // Kotlin When statement version 2
    println("What month is it?")
     val month = readLine()
    val location = when (month) {
        "Jan" -> "Greece"
        "Apr" -> "Italy"
        "Jul" -> "Japan"
        else -> "America"
    }
    println(location)

    // Kotlin When statement version 3
    println("What season is it? ")
    val season = readLine()
    val seasonal = when {
        season == "Summer" -> "Swim"
        season == "Fall" -> "Coat"
        season == "Spring" -> "Blossom"
        else -> "Winter is coming"
    }
    println(seasonal)


}