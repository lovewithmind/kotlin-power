package com.company.kotlin.sealed

fun main() {
    val newShape: Shape = Rectangle
    println(
        when (newShape) {
            Rectangle -> "I am a rectangle, I have ${newShape.side} sides, with each angle being ${newShape.angle}"
            Triangle -> "I am a triangle, I have ${newShape.side} sides, with each angle being ${newShape.angle}"
            Square -> "I am a square, I have ${newShape.side} sides, with each angle being ${newShape.angle}"
        }
    )

    println()

    //Java version
    val sample = Sample()
    sample.callingFunction()
    sample.testFunction(ShapeJava.Rectangle)

    println()

    //Kotlin version
    val solution = Solution()
    solution.callerFunction()
    solution.testFunction(Rectangle)
    solution.testFunction(Triangle)
}