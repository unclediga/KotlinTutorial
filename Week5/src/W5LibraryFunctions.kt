package coursera.week5

interface User{
    val name:String
    val age:Int
//    var email:String
}

open class Person(override val name: String, override val age: Int) :User{
    override fun toString(): String {
        return "${name} ${age}"
    }
}


//open class Person(override var email: String):User {
//    override val name: String
//        get() = "Test name"
//
//    override fun toString(): String {
//        return "${this.javaClass.name}(${name},${email})"
//    }
//}

fun main(args: Array<String>) {

    ////////////////////////////////////////////////////////////////////
    val lst = listOf<User>(Person("Mr.First",25),Person("Mr.Second",37),Person("Mr.Third",25))
    val map = HashMap<Int,MutableList<User>>()
    for(person in lst){
        if (person.age !in map) {
            map[person.age] = mutableListOf()
        }
        map.getValue(person.age) += person
    }
    println(map)

    val map2 = HashMap<Int,MutableList<User>>()
    for(person in lst) {
        val group = map2.getOrPut(person.age) { mutableListOf() }
        group += person
    }
    println(map2)

    var map3 = lst.groupBy { it.age }

    println(map3)
}