package org.example.udemy.sec5

fun main() {
    val emp = Employee("John")
    println(emp.firstName)

    val emp2 = Employee2("John")
    println(emp2.firstName)

    val emp3 = Employee3("John")
    println(emp3.firstName)

    val emp4 = Employee3("John")
    println(emp4.firstName)
    println(emp4.fullTime)

    val emp5 = Employee4("Peter",false)
    println(emp5.firstName)
    println(emp5.fullTime)

}
//primary constructor
class Employee constructor(firstName: String){
    val firstName: String = firstName
    /*init {
        this.firstName =firstName
    }*/
}

class Employee2 constructor(val firstName: String) {

}
// di queremos cambiar el access modifier del contructortor, tenemos que escribirle explicitamente protected constructor
class Employee3(val firstName: String) {
    var fullTime: Boolean = true
    constructor(firstName: String, fullTime: Boolean) : this(firstName){
        this.fullTime =fullTime

    }
}

class Employee4(val firstName: String, var fullTime: Boolean) {
}