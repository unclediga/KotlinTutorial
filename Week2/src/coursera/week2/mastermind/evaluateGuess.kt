package mastermind

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {

    var rp:Int = 0
    var wp:Int = 0

    var s = secret.toSet()
    //    for(c in secret) s = s.plus(c)
    //println("set=${s}")

    for(i in 0 until 4){
        if(secret.get(i) == guess.get(i)) rp++
        else if(s.contains(guess.get(i))) wp++
    }

    return Evaluation(rp,wp)

}
