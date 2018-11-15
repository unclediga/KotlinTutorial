package coursera.week2

enum class Color{
    BLUE,ORANGE,RED,
}

fun getDescription(color:Color):String =
    when (color) {
        Color.BLUE -> "cold"
        Color.ORANGE -> "mild"
        Color.RED -> "hot"
    }

fun whenSyntax(a: Any) =
        when (a) {
            0 -> "zero"
            is Int -> "is Int"
            is String -> "is string of length ${a.length}"
            else -> "other"
        }

fun updateWeather(degrees: Int) {
    val (descr, color) = when {
        degrees < 5 -> "cold" to Color.BLUE
        degrees < 32 -> "mild" to Color.ORANGE
        else -> "hot" to Color.RED
    }
    println("$descr,$color")
}



fun main(args: Array<String>) {

    println(whenSyntax(123))
    println(whenSyntax("Assa"))
    println(whenSyntax(true))


    updateWeather(35)

    var m = mapOf("a" to 1,"b" to 3,"c" to 5)
    for ((k, v) in m) {
        println("$k->$v")
    }

    var l = listOf("a","b","c" to 5)
    for ((i, v) in l.withIndex()) {
        println("$i->$v")
    }


}

