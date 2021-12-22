import kotlin.math.pow

fun main() {
      println(sum(2.0,3.0))
      println(power(2.0,3.0))

    //we can pass function a variable, we have to tell type of input parameter and output parameter and then we can pass using ::
      var fn: (a: Double, b: Double) -> Double =::sum
      println(fn(2.0,4.0))

}

fun sum(a: Double,b: Double):Double{
    return a+b
}

fun power(a: Double,b: Double): Double{
    return a.pow(b)
}

fun hello(a:Int): Unit{

}


