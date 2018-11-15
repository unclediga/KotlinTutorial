package coursera.week2

fun main(args: Array<String>){
    val t = "TestSTRING"
    println("from kotlin: lastChar(\"$t\")=${t.lastChar()}");
    println("from kotlin: repeat(\"$t\",3)=${t.repeat(3)}");

    val parent:Parent = Child()
    println(parent.foo())
}


open class Parent
class Child: Parent()

fun Parent.foo(): String = "parent"
fun Child.foo(): String = "child"
