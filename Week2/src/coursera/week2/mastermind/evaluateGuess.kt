package mastermind

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {
//    TODO("MY BIG REASON!")

    var rp:Int = 0
    var wp:Int = 0

    var s = setOf<Char>()

    for(c in secret) s = s.plus(c)
    //println("set=${s}")
    for(i in 0 until 4){
        if(secret.get(i) == guess.get(i)) rp++
    }

    for(c in s) {
        if (guess.contains(c)) {
            wp++
        }
    }
    return Evaluation(rp,wp)

}
