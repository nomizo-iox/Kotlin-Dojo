package main.kotlin.lesson7

import java.io.Serializable
import java.util.*

data class Student (val firstName: String,
                    val lastName: String,
                    var age: Int,
                    val dob: Date): Serializable
{
}