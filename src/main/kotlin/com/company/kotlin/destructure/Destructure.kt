package com.company.kotlin.destructure

data class Destructure(val name: String, val age: Int)

fun function() {
    val (name, age) = Destructure("name", 1)
}