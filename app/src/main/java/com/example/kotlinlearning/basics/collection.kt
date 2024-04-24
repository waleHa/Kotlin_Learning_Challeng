package com.example.kotlinlearning.basics

fun collection() {
    val mutableList: MutableList<Int> = mutableListOf(1, 2, 3)
    mutableList.add(4)

    val mathMarksMap: MutableMap<String,Int> = mutableMapOf<String,Int>()
    mathMarksMap["Ali"] = 80
    mathMarksMap["Susan"] = 90
    mathMarksMap["Ram"] = 99
    var people = 0
    var sum:Double = 0.0
    mathMarksMap.forEach{
        people ++
        sum += it.value
    }
    sum /= people
    println(sum)
}