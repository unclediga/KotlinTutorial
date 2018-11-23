package coursera.week4

import coursera.week4.oop.C3
import coursera.week4.oop.helloPrivate3
import coursera.week4.oop.helloPublic3

fun main(args: Array<String>) {
    helloPublic2()
    helloPrivate2()
    helloPublic3()
    helloPrivate3()

    var c3 = C3("C3 class")
    c3.helloPublic()
//    c3.helloProtected()
//    c3.helloPrivat()

    var c2 = C2("C2 class")
    c2.helloPublic()
//    c2.helloProtected()
//    c2.helloPrivat()


    data class Contact(val name: String, val address: String)

    var contact1 = Contact("First", "My first address")
    var contact11 = Contact("First", "My first address")
    var contact2 = contact1.copy(address =  "My second address")
    println("cont1 $contact1 hash=${contact1.hashCode()} java ${contact1.javaClass.hashCode()}")
    println("cont11 $contact11 hash=${contact11.hashCode()} java ${contact11.javaClass.hashCode()}")
    println("cont2 $contact2 hash=${contact2.hashCode()} java ${contact2.javaClass.hashCode()}")
    println("con1==con2 ${contact1==contact2}")
    println("con1===con2 ${contact1===contact2}")
    println("con1==con11 ${contact1==contact11}")
    println("con1===con11 ${contact1===contact11}")


}


