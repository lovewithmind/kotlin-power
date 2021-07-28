package com.company.kotlin.scoped

fun printMessage(message: String?) {
    println(
        message?.let {
            "Let $it Begin!"
        } ?: "OOPS!"
    )
}

fun main() {
    printMessage("Code Examples")
}


