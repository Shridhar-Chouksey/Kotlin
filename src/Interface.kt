import java.util.*

fun main() {
    dragObjects(arrayOf(Circle3(4.0),Square3(4.0),Triangle3(2.0,3.0),Player3("Shridhar")))
}

fun dragObjects(objects: Array<Draggable3>){
    for(obj in objects){
        obj.drag()
    }
}

interface Draggable3{
    //Interface ke andar koi bhi method define karte hain aur body define nhi karte,to woh method by default abstract hota hai
    fun drag()
}

abstract class Shape3: Draggable3{
    abstract fun area():Double
}

class Circle3(val radius:Double): Shape3(){
    override fun area(): Double =Math.PI*radius*radius
    override fun drag()= println("Circle3 is dragging")
}
class Square3(val side:Double): Shape3(){
    override fun area(): Double =side*side
    override fun drag()= println("Square3 is dragging")
}
class Triangle3(val base:Double,val height:Double):Shape3(){
    override fun area(): Double =0.5*base*height
    override fun drag()= println("Triangle3 is dragging")
}

class Player3(val name:String) :Draggable3{
   override fun drag()=println("$name is dragging")
}


//Abstract class works on type, interfaces works on behaviour
//Interface group objects based on what they can do rather than what they are.
//Interface helps to use polymorphism in unrelated set of classes(i.e. classes which do not belong to same inheritance hierarchy)
//Common Terminology: Interface is a contract which states that whoever implements that interface has to provide the implementation for the methods.
//Interface can have both abstract and concrete methods.
//Interface can implement other interfaces and one class can implement many interface but classes can have only one superclass.