package coursera.week3

data class Hero(
        val name: String,
        val age: Int,
        val gender: Gender?
)

enum class Gender { MALE, FEMALE }

val heroes = listOf(
        Hero("The Captain", 60, Gender.MALE),
        Hero("Frenchy", 42, Gender.MALE),
        Hero("The Kid", 9, null),
        Hero("Lady Lauren", 29, Gender.FEMALE),
        Hero("First Mate", 29, Gender.MALE),
        Hero("Sir Stephen", 37, Gender.MALE))

fun main(args: Array<String>) {
//    println(heroes)
    println("last()=${heroes.last().name}")
    println("firstOrNull()=${heroes.firstOrNull {it.age == 30}?.name}")
    println("distinct()=${heroes.map {it.age}.distinct().size}")
    println("filter()=${heroes.filter { it.age<30} }")
    val (youngest,oldest) = heroes.partition { it.age < 30 }
    println("partition() = ${oldest}< - >${youngest}")
    println("maxBy()=${heroes.maxBy { it.age }?.name}")
    println("all()=${heroes.all { it.age < 50 }}")
    println("any()=${heroes.any { it.gender == Gender.FEMALE }}")

    val mapByAge = heroes.groupBy { it.age }
    val (age,group) = mapByAge.maxBy { (_,group) -> group.size }!!
    println("age=${age} -> ${group}")

    val mapByName = heroes.associateBy { it.name }
    println("Frenchy age=${mapByName["Frenchy"]?.age}")

    val unknownHero = Hero("unknown",0,null)
    println("getOrElse()=${mapByName.getOrElse("unknown") {unknownHero}.age}")

    // THE BAD EXAMPLE OF THE CODE
    val (first, second) = heroes
            .flatMap { heroes.map { hero -> it to hero } }
            .maxBy { it.first.age - it.second.age }!!
    println("fn="+first.name+" sn="+second.name)

    // THE GOOD ONE !
    val (oldest1, youngest1) = heroes
            .flatMap { first -> heroes.map { second -> first to second } }
            .maxBy { it.first.age - it.second.age }!!
    println("fn="+oldest1.name+" sn="+youngest1.name)

    // AND MORE SIMPLE
    val oldest2 = heroes.maxBy { it.age }!!
    val youngest2 = heroes.minBy { it.age }!!
    println("fn="+oldest2.name+" sn="+youngest2.name)


}