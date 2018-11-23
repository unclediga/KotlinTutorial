package coursera.week4

import kotlin.random.Random

// Implement the property 'foo' so that it produced a different value on each access.
val foo: Int
    get() = ++f
// or
//    get() = Random.nextInt()

var f:Int = 0
fun main(args: Array<String>) {
    // The values should be different:
    println(foo)
    println(foo)
    println(foo)
}