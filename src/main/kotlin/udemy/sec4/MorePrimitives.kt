package org.example.udemy.sec4

import udemy.sec4.DummyClass

fun main() {
    var myDouble = 65.976
    println(myDouble is Double) //true
    println(myDouble is Int) //false


    val myFloat = -54.6f
    println("This is a Float: ${myFloat is Float}")

    val char = 'b'
    /*
    in java you can do
    char myChar = 65; // which is A
     */
    //val myChar :Char = 65 doesn't compile

    val myCharInt =65
    println(myCharInt.toChar())

    val myBoolean = true

    //interoperabilidad. El metodo de la classe en java quiere un boolean primitive

    val vacationTime = false
    val onVacation = DummyClass().isVacationTime(vacationTime) // se puede llamar porque kotli compila a boolean,
    // si la clase de java pidiera un Boolean, tambien funcionaria po el outboxing

    println(onVacation)
    //Any, Unit, Nothing,
    // Any--> como Object. void -_> en kotlin se devuelve Unit, un singleton de Unit
    //Nothing.class

}