package org.example.udemy.sec6

fun main() {
    //hasta5000()
    //fromMinus500T0Zero()
    fibonacci15()
}




fun fibonacci15() {
    var beforePrevious =0
    var previous =1;
    for (i in 0 .. 14){
        var result = when(i) {
            0 -> beforePrevious
            1 -> previous
            else -> {
                val result = beforePrevious + previous
                beforePrevious = previous
                previous = result
                result
            }
        }
        println(result)
    }
}

//5,10,15,20,25 ... 5000
fun hasta5000() {
    val range= 5 .. 5000
    for (num in range step 5){
        if(num==5000) {
            print("$num")
        }
        else print("$num,")
    }
}

fun fromMinus500T0Zero() {
    for (i in -500 .. 0){
        println(i)
    }
}