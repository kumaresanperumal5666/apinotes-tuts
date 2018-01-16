package modifiers

open class VisibilityProtected(){
    protected open var a: Int = 9

}

class VisibilityProtectedSub():VisibilityProtected(){
    init {
        println("a value is "+ super.a)
    }

}

fun main(args:Array<String>){
    var protect = VisibilityProtectedSub()
}