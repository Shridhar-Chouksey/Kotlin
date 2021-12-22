//Polymorphism: Parent can hold a referance to its child and call methods of the child classes(which are common)
fun main() {

    val circle:Shape=Circle(4.0)
    val square:Shape=Square(4.0)

    val shapes= arrayOf(Circle(3.0),Square(4.0))

    calculateAreas(shapes)

//    println(circle.area())
//    println(square.area())
}


fun calculateAreas(shapes: Array<Shape>){
    for(shape in shapes){
        println(shape.area())
    }
}

open class Shape{

    open fun area():Double{
        return 0.0
    }
}

class Circle(val radius:Double): Shape(){

    override fun area(): Double {
        return Math.PI*radius*radius
    }

}

class Square(val side:Double): Shape() {
    override fun area(): Double {
        return side * side
    }

}


