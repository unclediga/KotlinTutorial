//Fibonacci sequence
//Implement the function that builds a sequence of Fibonacci numbers
// using 'sequence' function ('buildSequence' is its old name).

fun fibonacci(): Sequence<Int> = sequence {
    yield(0)
    yield(1)
    yield(1)
    var f1 = 1
    var f2 = 1
    var f11:Int
    while(true){
        f11 = f2
        f2 = f1+ f2
        f1 = f11
        yield(f2)
    }

}

// Официаль...Конечно, круче моей поделки :-(
fun fibonacci2(): Sequence<Int> = sequence {
    var elements = Pair(0, 1)
    while (true) {
        yield(elements.first)
        elements = Pair(elements.second,elements.first + elements.second)
    }


}

fun main(args: Array<String>) {
    fibonacci().take(4).toList().toString() eq "[0, 1, 1, 2]"
    fibonacci().take(10).toList().toString() eq "[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]"

    fibonacci2().take(4).toList().toString() eq "[0, 1, 1, 2]"
    fibonacci2().take(10).toList().toString() eq "[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]"

    infix fun <T> T.eq(other: T) {
        if (this == other) println("OK")
        else println("Error: $this != $other")
    }
}

