fun main() {
    //we can pass function a variable, we have to tell type of input parameter and output parameter and then we can pass using ::
    var fn: (a: Double, b: Double) -> Double =::summ
    println(fn(2.0,4.0))
    calculator(4.0,6.0,::summ)
}

fun summ(a: Double,b: Double):Double{
    return a+b
}
fun calculator(a:Double,b:Double,gn: (Double,Double)->Double){
        val result=gn(a,b)
        println(result)
}












//Higher Order Functions: Function that accepts functions as argument or return functions or both.