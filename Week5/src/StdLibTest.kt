import java.lang.String.format

class Window(h: Int,
             w: Int,
             iV: Boolean) {
    var heigth: Int = h
    var width: Int = w
    var isVisible = iV
    override fun toString(): String {
        return format("h:${this.heigth} w:${this.width} iv:${this.isVisible}")
    }
}


fun main(args: Array<String>) {
    val w: Window? = Window(0, 0, false)
    val ww: Window? = null

//    val t: Int = null ?: return
//    println("t=${t}")
    val w2 = w?.apply {
        heigth = 100
        width = 200
        isVisible = true
    }
    println(w2)

    val w22 = ww?.apply {
        heigth = 100
        width = 200
        isVisible = true
    }?.also { it.heigth = 500 }

    println(w22)

    val w222 = w?.apply {
        heigth = 100
        width = 200
        isVisible = true
    }?.also { it.heigth = 500 }

    println(w222)


}