package org.example.ch2.sec4

fun main() {
    //forLoops()
    loopCollection()
}

fun loopCollection(){
    val coll = listOf<String>("red", "green", "blue")

    for (c in coll) {
        println("$c")
    }
}

fun forLoops(){
    for (i in 1..30){
        print(fizzBuzz(i))
    }
    println()
    for(i in 100 downTo 50 step 10){
        println(i)
    }

}

fun fizzBuzz(i:Int) = when{
    i%15 == 0 -> " quince "
    i%3 == 0 -> " tres "
    i%5 == 0 -> " cinco "
    else -> " $i "
}



