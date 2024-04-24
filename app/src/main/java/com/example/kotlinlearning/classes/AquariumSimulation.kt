package com.example.kotlinlearning.classes

// Define the FishAction interface
interface FishAction {
    fun eat()
}

// Define the FishColor interface
interface FishColor {
    val color: String
}

// A singleton object to represent the gold color
object GoldColor : FishColor {
    override val color = "gold"
}

// A class that implements FishAction, which will print the type of food it eats
class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

// The Plecostomus class that implements both FishAction and FishColor using interface delegation
class Plecostomus(fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("eat algae"),
    FishColor by fishColor

// The Shark class that also implements both FishAction and FishColor using interface delegation
class Shark(fishColor: FishColor = object : FishColor {
    override val color = "gray"
}): FishAction by PrintingFishAction("hunt and eat fish"),
    FishColor by fishColor

// A function to test and demonstrate the functionality of the classes
fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}")
    shark.eat()

    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

// The main function that calls makeFish to run the program
fun main() {
    makeFish()
}
