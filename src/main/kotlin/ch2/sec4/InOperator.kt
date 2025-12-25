package org.example.ch2.sec4

fun main(){
    println(isLetter('q'))
    println(isNotDigit('x'))
    println(recognize('9'))
}

fun isLetter(c: Char) : Boolean = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c:Char) = c !in '0'..'9'
fun recognize(char:Char) = when(char) {
    in 'a'..'z', in 'A'..'Z' -> "It's a letter"
    in '0'..'9' -> "It's a digit"
    else -> "I don't know"
}

//in Kotlin comparable: 9.2.2