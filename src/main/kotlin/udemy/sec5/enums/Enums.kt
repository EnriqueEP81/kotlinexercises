package org.example.udemy.sec5.enums

fun main() {
    println(DepartmentExt.HR.getDeptInfo())
}

enum class Department {
    HR, IT, ACCOUNTING, SALES
}

enum class DepartmentExt(val fullName: String) {
    HR("Human Resources"), IT("Info tech"), ACCOUNTING("acc"), SALES("sales");
    //si tienes una funcion necesitas un semicolon despues del ultimo valor
    fun getDeptInfo() =" this is $fullName"
}