

open class Base(p: Int){
    var baseVal = p
    fun printBase(){
        println(" This is base " + this.baseVal)
    }
}

class Derived(p: Int) : Base(p){
    var childVal = p
    fun printChild(){
        println(" This is child " + this.childVal)
    }
}

fun main(args: Array<String>){
    var child = Derived(6)
    child.printBase()
    child.printChild()
}
