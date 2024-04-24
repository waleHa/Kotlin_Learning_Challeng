package com.example.kotlinlearning.functions

import kotlin.reflect.KProperty0

fun higherOrderFunction(n1: Double, n2: Double, ops: (Double, Double) -> Double): Double{
    val result = ops(n1, n2)
    return result
}



fun sum(num1: Double, num2: Double):Double = num1 + num2


val multiply = {num1:Double,num2:Double->
    num1*num2
}