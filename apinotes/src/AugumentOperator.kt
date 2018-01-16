class AugumentOperator{

    fun printAugumentOperator(){
        var a = 3
        a += 5
        println(" addition is : " + a)

        a -= 5
        println(" subtraction is : " + a)

        a *= 5
        println(" multiplication is : " + a)

        a /= 5
        println(" division is : " + a)

        a %= 5
        println(" quotient is : " + a)
    }

    fun printIncreAndDecrement(){
        var a: Int = 0
        a++
        println(" Incremented A value is : "+ a)

        var b: Int = 2
        b--
        println(" Decremented B value is : "+ b)
    }

    fun printLogicalOperator(){
        var a: Int = 4
        var b: Int = 3
        var c: Int = 5
        var d: Int = 6

        var z = (a>b)&& (c>d)
        println(" && operator value is : "+ z)

        var y = (a>b) || (c>d)
        println(" || operator value is : "+ y)

        var x = (a!=b)
        println(" ! operator value is : "+ x)

    }

    fun printArithmeticOperator(){
        var a: Int = 4
        var b: Int = 2

        var p = a+b
        println(" addition is : " + p)
        var q = a-b
        println(" subtraction is : " + q)
        var r = a*b
        println(" multiplication is : " + r)
        var s = a/b
        println(" division is : " + s)
        var t = a%b
        println(" quotient is : " + t)

    }
    fun printComparisionOperator(){
        var a: Int = 4
        var b: Int = 3
        var c: Int = 5
        var d: Int = 6

        var i = a < b
        println(" i : "+ i)
        var j = a > b
        println(" j : "+ j)
        var k = a <= b
        println(" k : " + k)
        var l = a >= b
        println(" l : " + l)
        var m = a == b
        println(" m : " + m)
        var n = a != b
        println(" n : " + n)
    }
}

fun main(args:Array<String>){

    var ops = AugumentOperator()
    //ops.printIncreAndDecrement()
    //ops.printLogicalOperator()
    //ops.printArithmeticOperator()
    ops.printComparisionOperator()

}
