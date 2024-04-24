package com.example.kotlinlearning.main

import com.example.kotlinlearning.basics.Constants
import com.example.kotlinlearning.basics.collection
import com.example.kotlinlearning.basics.isInSet
import com.example.kotlinlearning.basics.loops
import com.example.kotlinlearning.basics.nullTypes
import com.example.kotlinlearning.basics.range
import com.example.kotlinlearning.basics.variables
import com.example.kotlinlearning.basics.whenExp
import com.example.kotlinlearning.classes.AudiPlayer
import com.example.kotlinlearning.classes.Expr
import com.example.kotlinlearning.classes.MediaPlayer
import com.example.kotlinlearning.classes.NetworkResponse
import com.example.kotlinlearning.classes.Streamable
import com.example.kotlinlearning.classes.User
import com.example.kotlinlearning.classes.VideoPlayer
import com.example.kotlinlearning.classes.eval
import com.example.kotlinlearning.classes.fetchData
import com.example.kotlinlearning.functions.higherOrderFunction
import com.example.kotlinlearning.functions.multiply
import com.example.kotlinlearning.functions.sum

fun main() {
    //var vs val vs const val
//    variables()
//    Constants

    //applying when, Random function
//    for (i in 1..10) {
//        println(whenExp())
//    }

    //Compact fun, set data type
//    println(isInSet(2, mutableSetOf(1,20,40)))

    //Apply ranges
//    println(range())

    //Null types
//    nullTypes()

    //MutableList, Find an average using key-value pair (MutableMap)
//    collection()

    //looping in an array using indices
//    loops()

    //Applying Higher-Order fun, lambda
//    println(higherOrderFunction(10.0, 20.0, ::sum))
//    println(higherOrderFunction(10.0, 20.0, multiply))
//    println(higherOrderFunction(10.0, 20.0) { a: Double, b: Double -> a / b })

    //Applying classes, getters and setters, Access/visibility modifiers, default constructor, init block
//    val user = User("Ali",1993)
//    println(user.userName)

    //Applying abstract, interfaces, polymorphism, smart casting
//    val videoPlayer = VideoPlayer()
//    val audioPlayer = AudiPlayer()
//    val players: List<MediaPlayer> = listOf(videoPlayer, audioPlayer)
//    for (player in players) {
//        player.playerStatus("Ready")
//        player.play()
//        if (player is Streamable) {
//            player.stream("www.stream.com")
//        }
//    }


    // Generics Example 1
//    val e1 = Expr.Const(1)
//    val e2 = Expr.Const(4)
//    val e3 = Expr.Sum(e1, e2)
//    val e4 = Expr.NotANumber
//
//    println(eval(e3))  // Expected output: 5
//    println(eval(e4))  // Expected output: Int representation of NaN, typically 0

    // Generics Example 2
    val response = fetchData()
    when (response) {
        is NetworkResponse.Success -> {
            println("Data: ${response.data}")
        }
        is NetworkResponse.Error -> {
            println("Error: ${response.exception.message}")
        }
        NetworkResponse.Loading -> {
            println("Loading...")
        }
    }

}