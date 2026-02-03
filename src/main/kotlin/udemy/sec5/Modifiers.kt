package org.example.udemy.sec5

fun main() {
    //default is public
    Employee("", false).firstName

    //getters and setters havs the same access modifier or less restrictive. luego una porp private no va a poder ser modificada
    // todas las modificaciones se hacen a traves de los getters and setters

    val emp2 = Employee2("peter", false)
    println(emp2.fullTime)

}

class Employee(val firstName: String, private val fullTime: Boolean){

}

//custom getter
class Employee2(val firstName: String, fullTime: Boolean = true){
    var fullTime = fullTime
        get(){
            println("Running the custom get")
            return field //backing field
        }

        set(value){
            println("Running the custom set")
            field = value
        }

}