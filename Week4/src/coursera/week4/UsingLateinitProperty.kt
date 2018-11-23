package coursera.week4.ex1

/* Without modifying the class 'A' complete the code in 'main' so that an exception
* UninitializedPropertyAccessException was thrown.
* Then fix the code so that no exception was thrown.
 */
class A {
    private lateinit var prop: String

    fun setUp() {
        prop = "value"
    }

    fun display() {
        println(prop)
    }
}

fun main(args: Array<String>) {
    val a = A()
//    a.display()  UninitializedPropertyAccessException was thrown.

    a.setUp()
    a.display()
}