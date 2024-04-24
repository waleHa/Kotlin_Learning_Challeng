package com.example.kotlinlearning.basics

fun variables() {
    //Kotlin supports two types of variables: mutable and Immutable.
    // With val, you can assign a value once. If you try to assign something again, you get an error.
    // With var, you can assign a value, then change the value later in the program.
    var a:Int = 1
    val b:String = "I Like the number $a"
    println(b)
}
object Constants{
    const val pi = 3.14159265359
}