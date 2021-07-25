package com.company.kotlin.dsl

class Body {
    init {
        println("<body>")
    }

    fun p(s: String) {
        println("<p>$s</p>")
    }
}

class HTML {
    init {
        println("<html>")
    }

    fun h1(value: String) {
        println("<h1>$value</h1>")
    }
}

fun html(init: HTML.() -> Unit): HTML {
    val html = HTML()
    html.init()
    println("</html>")
    return html
}

fun body(init: Body.() -> Unit): Body {
    val body = Body()
    body.init()
    println("</body>")
    return body
}

fun main() {
    html {
        h1("Title goes here")
        body {
            p("Paragraph goes here")
        }
    }
}
