package org.example.udemy.sec5.inherintance



class ClassSth : MySubInterface {

    override val number: Int = 25

    override fun mySubFunction(str: String): String {
        TODO("Not yet implemented")
    }

    override fun myFunction(str: String): String {
        TODO("Not yet implemented")
    }

}



interface MyInterface {
    val number :Int //abstract property
    //val number2:Int =50 //concrete, we cannot do that

    //what we can do is://backing field cannot be user
    val number2:Int
        get(){
            return number*100
        }

    fun myFunction(str:String): String
}

interface MySubInterface: MyInterface {
    fun mySubFunction(str:String): String
}