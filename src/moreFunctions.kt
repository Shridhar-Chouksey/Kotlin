fun main(){
  var fn: (a: Double, b: Double) -> Double =::addition
    println(fn(1.0,4.0))

}

fun addition(a: Double,b:Double): Double
{
         return a+b
}