package org.example.udemy.sec4

import udemy.sec4.DummyClass

fun main() {
    val myIntArray = intArrayOf(1,2,34)

    //interoperatibility
    val dc = DummyClass().printArray(myIntArray)

    val intArray:Array<Int> = myIntArray.toTypedArray()



}