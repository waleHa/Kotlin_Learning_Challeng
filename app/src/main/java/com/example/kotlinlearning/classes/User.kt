package com.example.kotlinlearning.classes

import java.util.Calendar

class User(
    userName: String,
    private var yearOfBirth: Int,

    ) {
    val currentYear: Int = Calendar.getInstance().get(Calendar.YEAR)
    val age: Int
        get() {
            return currentYear - yearOfBirth
        }


    private var city: String? = null
    private var mySet = mutableSetOf("Ahmed", "Ali")
    var userName: String? = null
        private set(a) {
            field = if (a in mySet) {
                a
            } else {
                "Unkown"
            }
        }

    init {
        this.userName = userName
        city = "Atlanta"
    }
}

/*
Access/visibility modifiers
public: means visible outside the class. Everything is public by default, including variables and methods of the class.
internal: means it will only be visible within that module. A module is a set of Kotlin files compiled together, for example, a library or application.
private: means it will only be visible in that class (or source file if you are working with functions).
protected: is the same as private, but it will also be visible to any subclasses.
 */