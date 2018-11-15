package coursera .week3

/*
* Implement an extension function 'isEmptyOrNull()' on the type String?.
* It should return true, if the string is empty or null.
*/

fun main(args: Array<String>) {
    val s1: String? = null
    val s2: String? = ""
    s1.isEmptyOrNull() eq true
    s2.isEmptyOrNull() eq true

    val s3 = "   "
    s3.isEmptyOrNull() eq false


    // STD LIB
    println("isNullOrEmpty()=${s1.isNullOrEmpty()}")
    println("isNullOrEmpty()=${s2.isNullOrEmpty()}")
    println("isNullOrEmpty()=${s3.isNullOrEmpty()}")
    println("isNullOrBlank()=${s1.isNullOrBlank()}")
    println("isNullOrBlank()=${s2.isNullOrBlank()}")
    println("isNullOrBlank()=${s3.isNullOrBlank()}")
}

// My solution
//infix fun Boolean.eq(b: Boolean) {
//    if(b == this) println("OK")
//    else println("$this <> $b")
//}

infix fun <T> T.eq(other: T) {
    if (this == other) println("OK")
    else println("Error: $this != $other")
}

private fun String?.isEmptyOrNull(): Boolean {
    return (this?.length ?: 0) == 0
}



