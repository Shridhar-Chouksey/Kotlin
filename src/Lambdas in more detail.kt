fun main() {
    val singleParam: (Int)->Int={x-> x+x}
    //If we have single parameter in a lambda expression, we can write above like this also, see below
    val simplifysingleParam:(Int)->Int={it+it}                     //In kotlin "it" points to single parameter

    //For greater readeability, it is advised to write lambda argument out of parenthesis
     calculator(2,4,{ a, b -> a + b })

}

fun sum2(a:Int,b:Int):Int=a+b

fun calculator2(a:Int,b:Int, op:(Int,Int)->Int):Int{
    return op(a,b)
}
