package coursera.week5

fun main(args: Array<String>) {
    val s = Session()
    println("${s.javaClass.typeName}")

    val d1 = s.descriptionNN  // String
    println(d1)
    val d2 = s.descriptionN  // String?
    println(d2)
    val d3 = s.description  // String!
    println(d3)

    println("NN = ${d1.length}")

    //println("origin = ${d3.length}")  // Exception in thread "main" java.lang.NullPointerException

    //println("${d2.length}") Error:(15, 18) Kotlin: Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type @Nullable String?
    println("N = ${d2!!.length}")  // Exception in thread "main" kotlin.KotlinNullPointerException
}