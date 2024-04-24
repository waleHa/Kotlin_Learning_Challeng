package com.example.kotlinlearning.basics

fun nullTypes(){
    var name: String? = null
    println(name?.length ?: "Ali".length)
    name = "Ali"
    println(name?.length)

}