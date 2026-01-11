package org.example.udemy.sec3

fun main() {
    bitwiseOp()

    val employee = Employee("Enrique", 1)
    val something : Any = employee

    // is !is
    if(something is Employee) {
        println("something is Employee")
        //val newEmployee = something as Employee
        // no cast needed, pero es como se hace el cast porque se hace Smart Casting,  despues de utilizar el operador is
        println(something.name)
    }

}

private fun bitwiseOp() {
    val x = 0x00101110
    val y = 0x11010101
    /*
    en java puedes hacer:
    x | y
    x & y

    pero en kotlin
     */
    x or y
    x and y
    println()
}