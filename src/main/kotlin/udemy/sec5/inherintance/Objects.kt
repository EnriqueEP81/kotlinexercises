package org.example.udemy.sec5.inherintance

import java.time.Year


fun main(){
    //onject keyword, when you want to create a singleton

    //en kotlin no podemos crear nada static: tennemos global declarations y object

    println(CompanyCimmnunicarions.getTagLine())
    println(CompanyCimmnunicarions.fun2())
    //companion objects. access variables without creating an instance. grouping static objects in there
    println(SomeClass.MyCompanion.accessPrivateVar())
}

object CompanyCimmnunicarions {
    val currenYear = Year.now().value

    fun getTagLine() = "Tagline"
    fun fun2() = "this is $currenYear"
}

class SomeClass {

    val someString : String
    constructor(str:String){
        someString = str
    }
    constructor(str:String, lowerCase: Boolean){
        if (lowerCase){
            someString = str.lowercase()
        }
        else {
            someString = str.uppercase()
        }
    }


    companion object MyCompanion {
        private val privateVar = 6
        fun accessPrivateVar() = println("accesion privateVar: $privateVar")
        //para acceder a constructores privados:
        fun justAssign(str:String) = SomeClass(str)
        fun upperCaseMethod(str:String) = SomeClass(str,true)
    }
    /*private val privateVar = 6
    fun accessPrivateVar() {
        println("accesion privateVar: $privateVar")
    }*/
}