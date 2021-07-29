package com.company.kotlin.sealed

// Creating this here is OK, as it is in the same base package. Try creating similar class or object in another package!
class Parallelogram(val angleA: Int, val angleB: Int) : Shape(4, angleA + angleB)

fun main() {
    println("--------------- Java Sample ---------------")
    val sample = Sample()
    sample.callingFunction()
    sample.testFunction(ShapeJava.Rectangle)

    println("--------------- Kotlin Solution ---------------")
    val solution = Solution()
    solution.callerFunction()
    solution.testFunction(Rectangle)
    solution.testFunction(Triangle)
    solution.testFunction(Parallelogram(60, 120))

    println("--------------- Kotlin Local Example---------------")
    val newShape: Shape = Parallelogram(50, 130)
    println(
        when (newShape) {
            is Parallelogram -> "I am a parallelogram, I have ${newShape.side} sides, " +
                    "with angles of ${newShape.angleA} and ${newShape.angleB} on each side which adds to ${newShape.angle}"
            Rectangle -> "I am a rectangle, I have ${newShape.side} sides, with each angle being ${newShape.angle}"
            Square -> "I am a square, I have ${newShape.side} sides, with each angle being ${newShape.angle}"
            Triangle -> "I am a triangle, I have ${newShape.side} sides, with each angle being ${newShape.angle}"
        }
    )
}
