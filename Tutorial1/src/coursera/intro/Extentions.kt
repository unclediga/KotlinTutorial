@file:JvmName("Utils")
package coursera.intro

import java.io.IOException

fun foo() = 1

fun boo(a:Int) = if(a == 2) "arg == 2" else "arg != 2"

fun bee() {
    for (ch in "abc") {
        print(ch + 1)
    }
}

@Throws(IOException::class)
fun test1() {
    println("Hello from test1()")
}