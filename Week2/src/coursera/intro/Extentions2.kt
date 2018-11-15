package coursera.intro

import java.io.IOException

fun foo2() = 2

fun bee2() {
    println("Hello from bee2!")
}

fun test2() {
    println("Hello from test2()")
    throw IOException("test2()")
}