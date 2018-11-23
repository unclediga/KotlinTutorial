package coursera.week4.oop

fun helloPublic3(){
    println("hello from helloPublic3")
}

fun helloPrivate3(){
    println("hello from helloPrivate3")
}

class C3(val name:String){

    private fun helloPrivate() {
        println("hello from helloPrivate C3")
    }

    fun helloPublic() {
        println("hello from helloPublic2 C3")
    }

    protected fun helloProtected() {
        println("hello from helloProtected C3")
    }

    override fun toString(): String {
        return "hello from C3($name)"
    }
}
