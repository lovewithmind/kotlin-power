package com.company.kotlin.sealed

sealed class Shape(
    val side: Int,
    val angle: Int
)

object Rectangle : Shape(4, 90)
object Square : Shape(4, 90)
object Triangle : Shape(3, 60)

class Solution {
    fun callerFunction() {
        testFunction(Square)
        //testFunction(Shape(1, 40)) //sealed classes cannot be instantiated
    }

    fun testFunction(shape: Shape) {
        println(
            when (shape) {
                Rectangle -> "I am a rectangle, I have ${shape.side} sides, with each angle being ${shape.angle}"
                Triangle -> "I am a triangle, I have ${shape.side} sides, with each angle being ${shape.angle}"
                Square -> "I am a square, I have ${shape.side} sides, with each angle being ${shape.angle}"
                is Parallelogram -> "I am a parallelogram, I have ${shape.side} sides, my angles are ${shape.angleA} and ${shape.angleB}." +
                        "The total is angle is ${shape.angle}."
            }
        )
    }
}