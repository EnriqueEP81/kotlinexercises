package org.example.udemy.sec4

fun main() {
    //eeverything is a class no primitive as in java

    val myInt = 10
    println("default data type is Int ${myInt is Int} ")
    var myLong = 22L
    val myLong2 : Long = 22

    /*
    this works in java, but it doesn't in Kotlin. Kotlin doesn't widen numbers
    int myInt = 10;
    long myLong = myInt;
     */

    // myLong = myInt doesn't compile
    myLong = myInt.toLong()

    val myByte : Byte = 111
    var myShort : Short
    myShort = myByte.toShort()

    // but it does widen literals
}