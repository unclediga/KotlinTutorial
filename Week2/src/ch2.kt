fun main(args:Array<String>){
    println(mix(Color.RED,Color.RED))
}

fun prn(assa: Int):Unit = println("ASssa")
fun prn2(a: Int, b:Int):Unit = println("${a}+${b}=${a+b}")

enum class Color(val r:Int, val g:Int, val b:Int){
    RED(255,0,0),ORANGE(255,160,0),
    BLUE(0,0,0),

    YELLOW(255,255,0),

    GREEN(0,255,0),
    ;

    fun rgb() = (r*256 + g)*256 + b
}
fun mix(c1:Color,c2:Color){
    when(setOf<Color> (c1,c2)){
        setOf(Color.RED,Color.YELLOW) -> Color.ORANGE
        setOf(Color.BLUE,Color.YELLOW) -> Color.GREEN
        else -> throw Exception("Грязный цвет")

    }
}

