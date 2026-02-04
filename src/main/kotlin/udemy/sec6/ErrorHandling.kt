package org.example.udemy.sec6

fun main() {
    //println(getNumber("3.12") ?: IllegalArgumentException("Number is not an Int"))
    println(getNumber("3.12") ?: "I can't print the result")

    notImplementedYet("string")

}

fun notImplementedYet(sth:String) : Nothing {
    throw IllegalArgumentException("implement me!")
}

fun getNumber(numStr:String):Int? {
    return try {
        Integer.parseInt(numStr)
    }
    catch(e : NumberFormatException){
        null
    }
    finally {
        println("finally")
    }
}