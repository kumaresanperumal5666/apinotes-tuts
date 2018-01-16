package abstractpack

abstract class AbstractClass(){
    abstract fun sum()
    fun subtract(){
        println(" i am non abstract function")
    }
}

class SumClass: AbstractClass(){
    override fun sum(){
        println(" I am abstract overridden function")
    }
}

fun main(args:Array<String>){
    var s = SumClass()
    s.sum()
    s.subtract()
}