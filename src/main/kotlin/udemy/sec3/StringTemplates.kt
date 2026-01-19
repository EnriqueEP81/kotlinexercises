package org.example.udemy.sec3

fun main() {
    val employee1 = Employee1("Quique",124)
    println(employee1)

    val change = 4.22

    println("show the value we use \$change $change")

    val divider = 10

    println("expressions: $change/$divider = ${change/divider}")
    println("employee's id ${employee1.id}")

    rawString()
}

fun rawString() {
    var filePath = """c:\myfolder\flolder1\file.txt"""
    val multilineText = """
        Buenos dias,
        que tal chaval
        adios.
    """.trimIndent()
    //trimMargin
    println(filePath)
    println(multilineText)
}

class Employee1(val name:String, val id:Int) {
    //intellij generate
    override fun toString(): String {
        return "Employee1(name='$name', id=$id)" //this is a string template
    }
}