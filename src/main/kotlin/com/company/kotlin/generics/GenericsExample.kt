package com.company.kotlin.generics

import com.company.kotlin.generics.models.Apple
import com.company.kotlin.generics.models.Fruit
import com.company.kotlin.generics.models.Orange

class GenericsExample<T>(private val state: T) {
    fun getState(): T {
        return state;
    }
}

fun <T> genericToString(something: T): String {
    return "The thing passed in to this function is $something"
}

fun main() {
    println("--------------- Simple Class with Generics ---------------")
    val genericClassA = GenericsExample(100)
    val genericClassB = GenericsExample("Hello World")
    val genericClassC = GenericsExample(listOf("A", "B"))

    println("Kotlin Example A: ${genericClassA.getState()}")
    println("Kotlin Example B: ${genericClassB.getState()}")
    println("Kotlin Example C: ${genericClassC.getState()}")

    println("--------------- Simple Function with Generics ---------------")
    println(genericToString("Hello"))
    println(genericToString(100))
    println(genericToString(listOf("A", "B")))

    println("--------------- Example use of Generics ---------------")
    fun <T : Fruit> getNameOfFruit(fruit: T): String {
        return "The fruit is an ${fruit.getName()}"
    }

    val apple = Apple("Green Apple", "Light Green")
    val orange = Orange("orange")
    println("${getNameOfFruit(apple)}, and it is ${apple.getColor()} in color.")
    println(getNameOfFruit(orange))
}