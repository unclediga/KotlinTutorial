import kotlin.random.Random

fun m(i: Int): Int {
    print("m$i ")
    return i
}

fun f(i: Int): Boolean {
    print("f$i ")
    return i % 2 == 0
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)
    list.map(::m).filter(::f)
//m1 m2 m3 m4 f1 f2 f3 f4
    println()
    repeat(30) { print("-") }
    println("\ntoList() map -> filter")
    list.asSequence().map(::m).filter(::f).toList()  // m1 f1 m2 f2 m3 f3 m4 f4

    println("\ntoList() filter -> map")
    list.asSequence().filter(::f).map(::m).toList()  //f1 f2 m2 f3 f4 m4

    println("\nto var")
    var e = list.asSequence().map(::m).filter(::f)  //empty

    println("\naccess to var")
    var e2 = e.count();   //m1 f1 m2 f2 m3 f3 m4 f4

    println("\nempty")
    list.asSequence().map(::m).filter(::f)  // empty

    println("\n\n 2nd filter")
    println(list.asSequence().map(::m).filter(::f).filter {
        if (it > 2) {
            print(" $it - is greater 2")
            return@filter true
        } else {
            print(" $it is lower 2 ")
            return@filter false
        }
    }.toList());   //m1 f1 m2 f2  2 is lower 2 m3 f3 m4 f4  4 - is greater 2[4]

    ///////////////////////////////////////////////////////////
    for (i in 1..5) {
        var seq = Random.nextInt(10).takeIf { it < 10 }
        println("seq=${seq?.takeIf { it < 10 }}")
    }

    val seq = generateSequence { Random.nextInt(10).takeIf { it > 0 } }
    println("seq=${seq.toList()}")


}

