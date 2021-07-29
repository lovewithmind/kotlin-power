package com.company.kotlin.scoped

import com.company.kotlin.scoped.models.Music
import com.company.kotlin.scoped.models.Person

fun printMessage(message: String?) {
    println(
        message?.let {
            "Let $it Begin!"
        } ?: "OOPS!"
    )
}

fun getAPerson(): Person? { // left nullable type here, so that we need to do a null check on this.
    return Person("John Doe", 21, listOf("Eating", "Sleeping"))
}

fun main() {
    printMessage("Code Examples")
    printMessage(null)

    println("--------------- let example ---------------")
    // commonly used in checking for nulls before performing action
    val personA = getAPerson()
    personA?.let {
        println("Meet ${it.name}. They are ${it.age} years old, and have the following hobbies: ${it.hobbies}.")
    }

    val john = Person("John", 21, listOf("Eating"))
    println("--------------- run example ---------------")
    // if you need to instantiate something before computing the return value
    john.run {
        heightInMeters = 1.78
        sayHello()
    }

    println("--------------- with example ---------------")
    // useful if you need to use a lot of details from an instance variable
    with(john) {
        heightInMeters = 1.55
        sayHello()
    }

    println("--------------- apply example ---------------")
    // useful for initializing objects, especially configuration classes
    val person = Person("Jim", 22, emptyList()).apply {
        heightInMeters = 1.68
    }
    println(person)
    val music = Music().apply {
        genre = "Pop"
        instrument = "Drums"
    }
    println(music)

    println("--------------- also example ---------------")
    // useful when you need to also do something on top of the action that's being performed.
    getAPerson().also {
        println("LOG: Retrieved $it")
    }?.let {
        it.heightInMeters = 1.2
        it.sayHello()
    }
}


