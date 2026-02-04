package org.example.udemy.sec7

fun main() {
    //run {println("I'm in a lambda")}

    val employees = listOf(Employee("John","Smith",2012),
        Employee("Jane","Wilson",2015))

    println(employees.minBy{e : Employee->e.startYear})
    //el compilador puede inferir:
    println(employees.minBy{e->e.startYear})
    //si solo hay un parametro y se puede inferir el tipo:
    println(employees.minBy{it.startYear})
    //member referencie
    println(employees.minBy(Employee::startYear))


    //en java solo puedes acceder en la lambda a final variables. pero esto es var:
    var num =10
    run {
        num+=15
        println(num)
        ::topLevelFuncion
    }
    //referencia a top lrvrl funvtion
    run (::topLevelFuncion)
    run{
        topLevelFuncion()
    }



}
fun topLevelFuncion() = println("i am in a function")

data class Employee(val firstName:String, val lastName:String,val startYear:Int){

}