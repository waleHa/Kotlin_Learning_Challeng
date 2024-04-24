package com.example.kotlinlearning.basics

import kotlin.random.Random

fun whenExp(): String {

    val r = Random.nextInt(6)
    return when (r){
              0 -> "Pizza"
            1 -> "Sushi"
            2 -> "Burger"
            in 3..4 -> "Juice"
        else -> "Other"
    }


}