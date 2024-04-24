package com.example.kotlinlearning.tasks

// 1- list -> mutable list
// 2- loop through each element
// 2.1- var zeroCounter = 0
// 2.2- val newList
// 3- if element == 0
// 3.1- zeroCounter += 1
// 4 if element != 0
// 4.1- add to newList
// add zeros to the newList

fun moveZeros(list: List<Int>): List<Int> {
    var zeroCounter = 0
    val newList = mutableListOf<Int>()


    for (element in list) {
        if (element != 0) {
            newList.add(element)
        } else {
            zeroCounter += 1
        }
    }
    for (element in 0 until zeroCounter) {
        newList.add(0)
    }
    return newList
}

