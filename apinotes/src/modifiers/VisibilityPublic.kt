package modifiers

class VisibilityPublic{
    public var a: Int = 3
}
fun main(args:Array<String>){
    var p = VisibilityPublic()
    println(" a value is : " + p.a)
}