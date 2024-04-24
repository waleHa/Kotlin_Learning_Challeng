package com.example.kotlinlearning.basics

fun loops (){
    val fruits = arrayOf("Apple", "Banana", "Cherry", "Date")

    for (i in fruits.indices){
        if (i == fruits.size-1){
            println("${i+1}- ${fruits[i]}.")
        }else{
            print("${i+1}- ${fruits[i]}, ")
        }
    }
}