package com.company.kotlin.generics.models

abstract class Fruit(private val name: String) {
    open fun getName(): String {
        return name
    }
}

/*
interface Fruit {
    fun getName(): String
}*/
