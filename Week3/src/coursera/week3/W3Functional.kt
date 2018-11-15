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
    println("map=${employees.filter ({ it.city == City.MOSKOW }).map(){ it.age }}")
    println("AVG=${employees.filter { it.city == City.MOSKOW }.map { it.age }.average()}")


    println("assa".zip("bessa"))
    var a:String = 'a'.toString()
    var l = listOf("abcd","1234").
            flatMap { it.toList()}.
            foldRight<Char, String>(
                    "",
                    {c: Char, acc: String -> acc.plus(c) })
    println(l)
    l = listOf("abcd","1234").
            flatMap { it.toList()}.
            fold<Char, String>(
                    "",
                    { acc: String, c: Char -> acc.plus(c) })
    println(l)

}

