package org.example.ch1

fun main(){
    val maxNumber = max2(5,3)
    println("Hola $maxNumber")
    println("El valor es ${if(maxNumber>2) "mayor que 2 " else "pequenio"}")
}

fun max(a:Int, b:Int) :Int {
    //bock body
    return if(a>b) a else b //In Kotlin, if is an expression, not a statement
}

fun max2(a:Int, b:Int) : Int = if(a>b) a else b //expression body

fun max2TypeInference(a:Int, b:Int) = if(a>b) a else b

//val readOnly

val question = "This is my question"
val question2 : String = "This is my questi"
val answer : Int = 45
val number = 7.5e6 //Double