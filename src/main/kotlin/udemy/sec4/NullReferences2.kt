package org.example.udemy.sec4

import java.util.Locale.getDefault

fun main() {

    val str: String? = "This is not null"
    var str2 = str?.uppercase(getDefault())

    //not null assertion: !! si quieres lanzar una exception cuando sea nulo
    str2 = str!!.uppercase()

    printText(str)
    printText(str!!)
    if(str!=null){
        printText(str)
    }
    str?.let { printText(it) }


}

fun printText(text:String) {
    println(text)
}