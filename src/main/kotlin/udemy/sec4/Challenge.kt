package org.example.udemy.sec4

fun main() {
    val float =-1.23f
    val float1: Float =-1.23f
    val float2 = -1.23.toFloat()

    //
    val float3: Float? =-1.23f
    val float4: Float?  = -1.23.toFloat()
    //
    val shortArray = shortArrayOf(1,2,3)
    val shortArray2 : Array<Short> = arrayOf(1,2,3)
    //
    val intArray = Array<Int?>(40){i -> (i+1)*5}
    //
    val charArray = charArrayOf('a','b','c')
    //
    val x:String? = "I AM IN UPPERCASE"
    val y = x?.lowercase() ?: "I give up"
    x?.let { println(it.lowercase().replace("am", "am not"))}
}