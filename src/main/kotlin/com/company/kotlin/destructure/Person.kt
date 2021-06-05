package com.company.kotlin.destructure
import com.company.kotlin.destructure.Destructure

class Person(val name: String, val age: Int)
internal class Example {
    fun function(destructure: Destructure) {
        val name = destructure.name
        val age = destructure.age
    }
}