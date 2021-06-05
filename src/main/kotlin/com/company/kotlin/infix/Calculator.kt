package com.company.kotlin.infix

infix fun Int.add(a: Int) : Int{
    return a + this
}

infix fun String.plus(str: String): String{
    return this + str
}

fun main() {
    val result = 1 add 2

    val s = "email" plus "@gmail.com"

    println(s)
}