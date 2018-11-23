package coursera.week4

data class Point(val x:Int,val y:Int, val l:Int = 0)

operator fun Point.plus(other:Point): Point {
    return Point(this.x+other.x, this.y + other.y)
}

operator fun List<Int>.plus(other:List<Int>): List<Int> {
    return this.zip(other).map { it.first+it.second}
}

fun main(args: Array<String>) {
    val p1 = Point(1,2)
    val p2 = Point(10,20)
    println("${p1 + p2}")
    val l1 = listOf<Int>(1,2,3,5,6)
    val l2 = listOf<Int>(10,20,30)
    println("${l1 + l2}")


    val (x,y,l) = p2
    println("$x $y $l")
}