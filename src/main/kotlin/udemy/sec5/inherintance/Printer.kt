package org.example.udemy.sec5.inherintance


fun main() {
    val laserPrinter = LaserPrinter("Brother 1234",1000)
    laserPrinter.printModel()
    println(laserPrinter.bestSellingPrice())
}

abstract class Printer(val modelName : String) {
    //open porque pordefecto es final, pero si es abstract no hace falta

    //open para poder hacer override en la clase hija
    open fun printModel() = println("The model is $modelName")

    abstract fun bestSellingPrice() : Double
}

open class LaserPrinter(modelName: String, ppm:Int) : Printer(modelName) {

    final override fun printModel() = println("The model of this laser printer is $modelName")
    override fun bestSellingPrice(): Double = 129.99

}

class SpecialLaserPrinter(modelName: String) : LaserPrinter(modelName,100) {
    //override fun printModel() = println("this is my way ") no compila porque esta declarado final. una zex que haces
    //override se convierte en open, luego tienes que poner final si no quieres que se sobre escriba
}

open class Something(val x:Int) {
    // no tiene primary constructor, desde cualquier constructor siempre se delega al primary, en caso de que exista
    var someProperty: String ="sth"
    constructor(someParameter:String, y:Int):this(y) {
        someProperty = someParameter
    }
}

class SomethingElese : Something {
    constructor(someOtherParameter:String, z:Int):super(z)
}