package org.example.ch2.sec4

fun main() {
    val miArray = arrayOf("uno","dos","tres")
    println(miArray.get(1))
    println(miArray[1])

    val arrayOfLongs = arrayOf(1L,2L,5L)
    val arrayOfLongs2 = arrayOf<Long>(1,3,9)
    val arrayOfLongs3 = arrayOf(1,3,4)

    println(arrayOfLongs is Array<Long>)
    println(arrayOfLongs2 is Array<Long>)
    println(arrayOfLongs3 is Array<Int>)

    //lambda expression. i en este caso es el indice, luego 0,,1,2,3...
    val evenNumbers = Array(16) {i -> i*2}

    for (number in evenNumbers){
        print("$number, ")
    }

    val lotsOfNumbers = Array(10000) {i->i+1}
    val allZeros = Array(100){0}



    println("")
    var enteros : Array<Int>
    enteros = arrayOf(1,2,3)

    for(entero in enteros){
        print("$entero, ")
    }
    println()

    enteros = Array(6){i->(i+1)*100}
    for(entero in enteros){
        print("$entero, ")
    }
    println()

}