package com.company.kotlin.sealed

sealed class Shape(
        val side: Int,
        val angle: Int
)

object Rectangle : Shape(4, 30)
object Square : Shape(4, 90)


class Solution{
    fun callerFunction() {

    }

    fun testFunction(shape: Shape){

    }
}