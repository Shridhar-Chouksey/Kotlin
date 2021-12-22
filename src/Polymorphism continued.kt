//Whenever shape is required we can pass Mycircle, My Square etc whatever methods are there, because they all inherit from shape,
//But we cannot pass Shape Object where Circle is required ,because all shapes are not circle.
fun main() {
    val circle= Circle(4.0)
    println(circle.toString())
}

open class MyShape{
    open fun area():Double= 0.0
}
class MyCircle(val radius:Double): Shape(){
    override fun area(): Double = Math.PI*radius*radius
}


