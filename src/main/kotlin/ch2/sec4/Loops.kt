package org.example.ch2.sec4

fun main() {
    //forLoops()
    //loopCollection()
    //loopMaps()
    listWithIndex()
}

fun listWithIndex() {
    var list = listOf("uno", "dos", "tres")
    for((index, ele) in list.withIndex()){
        println("$index : $ele")
    }
}

fun loopMaps() {
    var binaryReps = mutableMapOf<Char,String>()
    for (char in 'A'..'F') {
        val binary = char.code.toString(radix=2) //named arguments
        binaryReps[char] = binary
    }

    for ((letter,binary) in binaryReps){
        println("$letter = $binary")
    }
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



