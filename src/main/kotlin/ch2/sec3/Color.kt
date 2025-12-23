package org.example.ch2.sec3

enum class Color(
  val r:Int,
  val g:Int,
  val b:Int
) {
    RED(255,0,0),
    ORANGE(255,265,0),
    YELLOW(255,165,0),
    GREEN(0,255,0),
    BLUE(0,0,255),
    INDIGO(75,0,130),
    VIOLET(0,0,0);

    val rgb = (r*256+g)*256+b

    fun printColor() = println("$this is $rgb")


}

fun getMnemonic(color: Color)=
    when(color){
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }

fun mix(c1: Color, c2: Color) =
    when (setOf(c1,c2)) {
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        setOf(Color.BLUE, Color.YELLOW) -> Color.GREEN
        else -> throw Exception("Dirty Color")
    }

fun mixOptimized(c1: Color, c2: Color) =
    when {
        (c1 == Color.RED && c2== Color.YELLOW) ||
        (c2 == Color.RED && c1== Color.YELLOW) -> Color.ORANGE

        else -> throw Exception("Dirty Color")
    }

fun main() {
    println(Color.YELLOW.rgb)
    Color.YELLOW.printColor()
    println(getMnemonic(Color.YELLOW))
    println(mix(Color.BLUE, Color.YELLOW))
}


