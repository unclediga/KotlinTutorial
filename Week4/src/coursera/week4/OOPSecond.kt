package coursera.week4

fun helloPublic2(){
    println("hello from helloPublic2")
}

fun helloPrivate2(){
    println("hello from helloPrivate2")
}

class C2(val name:String){

    private fun helloPrivate() {
        println("hello from helloPrivate C2")
    }

    fun helloPublic() {
        println("hello from helloPublic C2")
    }

    protected fun helloProtected() {
        println("hello from helloProtected C2")
    }

    override fun toString(): String {
        return "hello from C2($name)"
    }
}
