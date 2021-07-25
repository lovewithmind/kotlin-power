package com.company.kotlin.hof

// In kotlin function are first class citizen
class HighOrderFunction {
    fun helloWorld(){

    }

    fun application(){
        val f = ::helloWorld
    }
}