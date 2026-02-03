package org.example.udemy.sec5.inherintance

open class Someth {
    val someProperty : String

    constructor(someParam:String) {
        someProperty = someParam
        println("parent")
    }
}

class SomethElse : Someth {
    constructor(someOtherParam:String): super(someOtherParam) {
        println("child")
    }
}

fun main() {
    val obje = SomethElse("")
}