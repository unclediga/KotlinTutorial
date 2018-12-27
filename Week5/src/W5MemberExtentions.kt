//   Member extensions
//   ------------------
//Implement member extension functions 'record' and 'unaryPlus' so
// that the code below compiled and stored specified words.
// These functions should be unavailable outside of the 'Words' class.

class Words {
    private val list = mutableListOf<String>()

    fun String.record(){
        list += this
    }

    operator fun String.unaryPlus() {
//        this.record()            необязательно !

        record()

//        with(this){              необязательно !
//            record()
//        }
    }

    override fun toString() = list.toString()

}

fun main(args: Array<String>) {
    val words = Words()
    with(words) {
        // The following two lines should compile:
        "one".record()
        println("assa")
        +"two"
    }

    words.toString() eq "[one, two]"


    "test"+words
    println(words)   // words не изменился [one, two]
    "test2".unaryPlus(words)
    println(words)   // words не изменился [one, two]


    infix fun <T> T.eq(other: T) {
        if (this == other) println("OK")
        else println("Error: $this != $other")
    }

}

private fun String.unaryPlus(words: Words) {
    this+words
}



