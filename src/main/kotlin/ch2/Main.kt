package org.example.ch1

fun main(){
    val maxNumber = max(5,3)
    println("Hola $maxNumber")
}

fun max(a:Int, b:Int) :Int {
    return if(a>b) a else b //In Kotlin, if is an expression, not a statement
}