package coursera.week4

interface User{
    val name:String
    var email:String
}

open class Person(override var email: String):User {
    override val name: String
        get() = "Test name"

    override fun toString(): String {
        return "${this.javaClass.name}(${name},${email})"
    }
}

class VIPerson(car:String): Person("vip@mail.com") {

}

fun main(args: Array<String>) {
    println("${Person("iga@mail.com")}")
    println("${VIPerson("Mozeratti")}")
}