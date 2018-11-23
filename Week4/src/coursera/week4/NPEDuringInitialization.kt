package coursera.week4

// Complete the declaration of the class A so that NPE was thrown during the creation of its subclass B instance.
open class A(open val value: String) {
    init {
        value.length
    }
}

class B(override val value: String) : A(value)

fun main(args: Array<String>) {
    B("a")
}