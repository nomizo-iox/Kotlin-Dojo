package main.kotlin.lesson5

fun main() {
    /* Extension function, is a function that is defined outside of a class,
     but can be called as a member function for a class
     */
    fun String.getEmotion(): String {
        return when {
            last() == '!' -> "Exciting"
            last() == '?' -> "Curious"
            last() == '.' -> "Calm"
            else -> "Unidentified"
        }
    }

    // Kotlin is an extension upon the Java classes
    val s = "How are you?"
    println(s.getEmotion())
}
