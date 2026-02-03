package org.example.udemy.sec5

fun main() {
    // they return UNit instad of void

    //with block body{}
    //with an expression body
    val emp = Empleado("enrique");
    println(emp.upperCaseFN())


    //spread operator array to varags or if yo want to unpack an array

    //Extension functions

    //Inline functions
}

fun tresPorCuatro() = 3*4

class Empleado( val firstName: String){
    fun upperCaseFN() = firstName.uppercase()
}