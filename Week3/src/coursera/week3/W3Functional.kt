package coursera.week3

enum class City(name: String) {
    PRAGUE("Прага"),
    MOSCOW("Москва")
}

data class Employee(
        val city: City, val age: Int
)

val employees: List<Employee> = listOf(Employee(City.MOSCOW, 44), Employee(City.MOSCOW, 40), Employee(City.PRAGUE, 33))

fun main(args: Array<String>) {
    println("filter=${employees.filter { it -> it.city == City.MOSCOW }}")
    println("map=${employees.filter({ it.city == City.MOSCOW }).map() { it.age }}")
    println("AVG=${employees.filter { it.city == City.MOSCOW }.map { it.age }.average()}")


    println("assa".zip("bessa"))
    var l = listOf("abcd", "1234").flatMap { it.toList() }.foldRight<Char, String>(
            "",
            { c: Char, acc: String -> acc.plus(c) })
    println(l)
    l = listOf("abcd", "1234").flatMap { it.toList() }.fold<Char, String>(
            "",
            { acc: String, c: Char -> acc.plus(c) })
    println(l)

    //-------------------------------------
    // invoke() - for using nullable lambdas
    val f1: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    val f2: ((Int, Int) -> Int)? = { a: Int, b: Int -> a + b }
    println(f1(1, 2))
    println(f2?.invoke(1, 2))

    fun isEven(i: Int): Boolean = i % 2 == 0
    val predicate = ::isEven
    println("isEven(2) = ${predicate(2)}")
    println("isEven(3) = ${predicate(3)}")

    val isEven2: (Int) -> Boolean = { i: Int -> i % 2 == 0 }
    val predicate2 = isEven2
    println("isEven(2) = ${predicate2(2)}")
    println("isEven(3) = ${predicate2(3)}")


    val list = listOf(1, 2, 3, 4)
    println(list.filter(::isEven))


    class Person(val name: String, val age: Int) {
        fun isOlder(ageLim: Int) = age > ageLim
    }

    var agePredicat = Person::isOlder
    val alice = Person("Alice", 29)
    println("age older=${agePredicat(alice, 21)}")


    // Return from lambda

    fun duplicateNonZero(list: List<Int>): List<Int> {
        return list.flatMap {
            if (it == 0) return listOf()
            else listOf(it, it)
        }
    }
    println(duplicateNonZero(listOf(3, 0, 5))) // []

    fun duplicateNonZero_II(list: List<Int>): List<Int> {
        return list.flatMap {
            if (it == 0) return@flatMap listOf(0)
            else listOf(it, it)
        }
    }
    println(duplicateNonZero_II(listOf(3, 0, 5))) // [3,3,0,5,5]

    fun duplicateNonZero_III(list: List<Int>): List<Int> {
        return list.flatMap fm@{
            if (it == 0) return@fm listOf(0)
            else listOf(it, it)
        }
    }
    println(duplicateNonZero_III(listOf(3, 0, 5))) // [3,3,0,5,5]


    // ALTERNATIVE
    fun duplicateNonZero_IV(list: List<Int>): List<Int> {
        fun duplicateNonZeroElement(el: Int): List<Int> {
            return if (el == 0) return listOf(0)
            else listOf(el, el)
        }

        return list.flatMap { duplicateNonZeroElement(it) }

    }

    println(duplicateNonZero_IV(listOf(3, 0, 5))) // [3,3,0,5,5]

    fun duplicateNonZero_V(list: List<Int>): List<Int> {

        return list.flatMap (
            fun(el): List<Int> {
                if (el == 0) return listOf(0)
                else return listOf(el, el)
            }
        )

    }

    println(duplicateNonZero_V(listOf(3, 0, 5))) // [3,3,0,5,5]


}

