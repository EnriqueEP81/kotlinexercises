package org.example.udemy.sec3

//typealias. StringBuilder is a typealias:
// public typealias StringBuilder = java.lang.StringBuilder
typealias EmployeeSet = Set<Employee>

//top level function>. no static keyword, but the cocept is there the top level function is static
fun main() {
    //val is like final.
    // type inference: static, at compile time

    val number = 25
    val number2 : Int // no asignamos
    val number3 : Int = 25 // normalmente esto no se hace a no ser que queramos q no sea Int:
    val number4 : Short = 25

    //number = 26 compile error

    var numberMut = 25
    numberMut = 26
    numberMut = 27

    val employee1 = Employee("Lynn Jones", 500)
    employee1.name = "Lynn Smith" // val doesn't mean it's immutable for classes, only that it cannot be reassigned

    //employee1 = Employee("Tim Wa", 200) //compile error

    val employeeOne = Employee("mary",1)
    val employeeTwo = Employee("john",2)
    val employeeThree = Employee("john",2)

    println(employeeOne == employeeTwo) //false
    println(employeeTwo == employeeThree) //true! distinto en Java. == checks for struture
    println(employeeOne.equals(employeeTwo)) //false
    println(employeeTwo.equals(employeeThree))//true
    println("**************")
    // referencial equality? === operator: 0 !==
    println(employeeOne === employeeTwo) //false
    println(employeeTwo === employeeThree) //true! distinto en Java. == checks for struture
    println(employeeOne == employeeTwo) //false
    println(employeeTwo == employeeThree)


}

class Employee(var name : String, val id: Int) {

    override fun equals(obj: Any?) : Boolean {
        if (obj is Employee) {
            return name == obj.name && id == obj.id
        }
        return false
    }

}