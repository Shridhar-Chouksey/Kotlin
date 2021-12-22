fun main() {
    val circle= Circle2(4.0)
    println(circle.area())
    circle.display()
}

abstract class A{
    fun method1(){
        println("I am method")
    }
}

abstract class Shape2{
      var name:String=""
      abstract fun area(): Double
      abstract fun display()
}

class Circle2(val radius:Double): Shape2(){
    override fun area(): Double =Math.PI* radius*radius
    override fun display() {
          println("Circle is getting displayed")
    }
}