package org.example.udemy.sec5

val MY_CONSTANT = 100

fun main() {
    //puedes tener top-level constants: fuera de una clase
    println(MY_CONSTANT)

    val car = Car("blue","Toyota", 2007)

    car.copy(year = 2089)
}

data class Car(val color:String, val model:String, val year:Int){
    //vienen con tostring, copy, hashcode, equals
}