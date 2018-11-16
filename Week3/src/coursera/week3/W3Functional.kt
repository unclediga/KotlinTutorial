package coursera.week3

enum class City(name: String) {
    PRAGUE("Прага"),
    MOSKOW("Москва")
}

data class Employee(
        val city: City, val age: Int
)

val employees: List<Employee> = listOf(Employee(City.MOSKOW, 44), Employee(City.MOSKOW, 40), Employee(City.PRAGUE, 33))

fun main(args: Array<String>) {
    println("filter=${employees.filter { it -> it.city == City.MOSKOW }}")
    println("map=${employees.filter({ it.city == City.MOSKOW }).map() { it.age }}")
    println("AVG=${employees.filter { it.city == City.MOSKOW }.map { it.age }.average()}")


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
    val f1:(Int,Int) -> Int = { a: Int, b: Int -> a + b }
    val f2:((Int,Int) -> Int)? = { a: Int, b: Int -> a + b }
    println(f1(1,2))
    println(f2?.invoke(1,2))


}

