package com.company.kotlin.scoped.models

class Music(var genre: String = "Jazz", var instrument: String = "Saxophone") {
    override fun toString(): String {
        return "Music(genre='$genre', instrument='$instrument')"
    }
}