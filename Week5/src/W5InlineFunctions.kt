fun getEmail(addr: Int = 99): String? =
        when (addr) {
            1 -> "a@bcd.com"
            2 -> "info@bbc.com.uk"
            else -> null
        }

fun sendEmail(email: String) = println("sending e-mail to $email")

fun main(args: Array<String>) {

    val email = getEmail(1)
    val res = run {
        sendEmail("a@a.com")
        println("are sent...")
        true
    }

    val email1 = getEmail(1)
    email1?.let { e -> sendEmail(e) }

    val email2: Unit? = getEmail(2)?.let { sendEmail(it)}

    val email3 = getEmail()
    email3?.let { e -> sendEmail(e) }


    mylambda(23, { a, b -> "lb1: pars :$a,$b"})
    mylambda(23) { a, b -> "lb2: pars :$a,$b"}
    mylambda2 {"lb2: pars"}
}


private fun testFirst(list: List<*>) {
    val a = list[0]
    if (a is String) {
        //val s:String = a as String
        val s:String = a   // SMARTCAST
        println("first is String for $list")
    } else if (a is Int) {
        val i:Int = a  // SMARTCAST
        println("first is Int for $list")
    }
}


fun mylambda(i:Int, f:(Int,Int) -> String){
    println("myLambda -> f(i=${i})=${f(i,i)}")
}
fun mylambda2(f:() -> String){
    println("myLambda2 -> f()=${f()}")
}