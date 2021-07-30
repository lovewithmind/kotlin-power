package com.company.kotlin.scoped.models

data class Person(
    val name: String,
    val age: Int,
    val hobbies: List<String>,
    var heightInMeters: Double? = null
) {
    fun sayHello() {
        println("Hello, I'm $name. Nice to meet you.")
        heightInMeters?.let {
            println("My height is: $heightInMeters meters")
        }
    }
}