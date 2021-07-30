package com.company.kotlin.generics.models

class Apple(private val name: String, private val color: String) : Fruit(name) {
    override fun getName(): String {
        return name.uppercase()
    }

    fun getColor(): String {
        return color
    }
}

class Orange(private val name: String) : Fruit(name) {
    override fun getName(): String {
        return name.uppercase()
    }
}