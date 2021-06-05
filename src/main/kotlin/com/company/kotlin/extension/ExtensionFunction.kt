package com.company.kotlin.extension

fun String.isValidEmail(): Boolean {
    val regex = Regex("\\S+@\\S+\\.\\S+\$")
    return regex.matches(this)
}

fun Int.isZero(): Boolean{
    return this == 0
}


