package org.example.udemy.sec6

fun main() {
    val someCondition = 2>1
    val num = if(someCondition) 50 else 60 // no necesitamos el ternar operator

    val num2 = if(someCondition) {
        println("something")
        50
    }
    else {
        println("something else")
        60
    }

    val num3 = if(someCondition) {
        println("something")
    }
    else {
        println("something else")
    }

    println(num3.javaClass)


}