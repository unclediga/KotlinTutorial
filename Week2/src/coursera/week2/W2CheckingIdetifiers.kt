package coursera.week2

fun isValidIdentifier_Ver2(s: String): Boolean {
    //    TODO("Пока не реализована")
    fun tt(sv: String): Boolean {
        if (sv.isEmpty()) return true;

        val sv2 = sv.substring(1)
        when (sv) {
            in "0".."9" -> return tt(sv2)
            in "A".."Z" -> return tt(sv2)
            in "a".."z" -> return tt(sv2)
            "_" -> return tt(sv2)
//            "$" -> return tt(sv2)
        }
        return false
    }

    if (s.isEmpty()) return false
    var s1 = s.substring(0, 1)
    var s2 = s.substring(1)
    if (s1 in "0".."9") return false
    return tt(s2)

}

fun isValidIdentifier(s: String): Boolean {
    fun isValidCharacter(ch: Char) = ch == '_' || ch in '0'..'9' || ch in 'a'..'z' || ch in 'A'..'Z'

    if (s.isEmpty() || s[0].isDigit()) return false;
    for (c in s)
        if (!isValidCharacter(c)) return false
    return true
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false

}

