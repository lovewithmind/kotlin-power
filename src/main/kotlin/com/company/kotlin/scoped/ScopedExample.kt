package com.company.kotlin.scoped

import com.company.kotlin.scoped.models.Music
import com.company.kotlin.scoped.models.Person

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


