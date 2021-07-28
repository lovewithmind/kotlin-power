package com.company.kotlin.generics

class GenericsExample<T>(private val state: T) {
    fun getState(): T {
        return state;
    }
}

fun <T> genericToString(something: T): String {
    return "The thing passed in to this function is $something"
}

fun main() {
    val genericClassA = GenericsExample(100)
    val genericClassB = GenericsExample("Hello World")
    val genericClassC = GenericsExample(listOf("A", "B"))

    println("Kotlin Example A: ${genericClassA.getState()}")
    println("Kotlin Example B: ${genericClassB.getState()}")
    println("Kotlin Example C: ${genericClassC.getState()}")

    println(genericToString("Hello"))
    println(genericToString(100))
    println(genericToString(listOf("A", "B")))
}