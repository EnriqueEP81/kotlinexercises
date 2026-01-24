package org.example.udemy.sec4

import java.util.Locale.getDefault

fun main() {
    //val str: String =null no compila

    val str: String?  = null
    println("mira lo que pasa ${str?.uppercase()}") //safety operator

    val str2: String? = "This is not null"

    if(str2!=null){
        str2.uppercase(getDefault())
    }

    str2?.uppercase(getDefault())

    //?: elvis operator

    val str3 = str ?: "default value"
    println(str3)

    //safe cast operator

    val something: Any = arrayOf(1,2,3)
    val str4 =something as? String
    println(str4)


}