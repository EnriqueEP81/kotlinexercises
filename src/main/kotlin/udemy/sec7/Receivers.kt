package org.example.udemy.sec7


fun main() {
    //println(countTo100())
    val employees = listOf(Employee1("John","Smith",2012),
        Employee1("Jane","Wilson",2015))
    findByLastName(employees,"Smith")
    findByLastName(employees,"Estebaranz")

    "Some string".apply somestring@ {
        "Another string".apply {
            println(this.lowercase())
            println(uppercase())
            println(this@somestring.uppercase())
        }
    }

}

fun findByLastName(employees:List<Employee1>, lastName: String) {
    employees.forEach returnBlock@{
        if(it.lastName == lastName){
            println("hemos encontrado el empleado con apellido $lastName")
            return@returnBlock
            //se imprimern los dos mensahes aunque se encuentre el lastName
        }
    }
    println("No hemos encontado el empleado con apellido $lastName")
}

fun findByLastName_v2(employees:List<Employee1>, lastName: String) {
    employees.forEach{
        if(it.lastName == lastName){
            println("hemos encontrado el empleado con apellido $lastName")
            return
        }
    }
    println("No hemos encontado el empleado con apellido $lastName")
}

fun findByLastName_v1(employees:List<Employee1>, lastName: String) {
    for (employee in employees){
        if(employee.lastName == lastName){
            println("hemos encontrado el empleado con apellido $lastName")
            return
        }
    }
    println("No hemos encontado el empleado con apellido $lastName")
}

data class Employee1(val firstName:String, val lastName:String,val startYear:Int){

}

fun countTo100() =
    StringBuilder().apply() {
        for (i in 1..99) {
            append(i)
            append(",")
        }
        append(100)
    }.toString()


fun countTo100_v3() : String {
    return StringBuilder().apply() {
        for (i in 1..99) {
            append(i)
            append(",")
        }
        append(100)
    }.toString()
}

fun countTo100_v2() : String {
    return with(StringBuilder()) {
        for (i in 1..99) {
            append(i)
            append(",")
        }
        append(100)
        toString();
    }
}


fun countTo100_v1() : String {
    val numbers = StringBuilder()
    for(i in 1 ..99){
        numbers.append(i)
        numbers.append(",")
    }
    numbers.append(100)
    return numbers.toString();
}