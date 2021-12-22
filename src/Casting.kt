fun main() {
         val circle4=Circle4(4.0)
         val player4=Player4("Shridhar")

         val arr= arrayOf(circle4,player4)
         for(obj in arr){
             if(obj is Circle4){
                println(obj.area())
             }
             else{
                 (obj as Player4).sayMyName()
             }
         }
}

interface Draggable4{
    //Interface ke andar koi bhi method define karte hain aur body define nhi karte,to woh method by default abstract hota hai
    fun drag()
}

abstract class Shape4: Draggable4{
    abstract fun area():Double
}

class Circle4(val radius:Double): Shape4(){
    override fun area(): Double =Math.PI*radius*radius
    override fun drag()= println("Circle4 is dragging")
}
class Square4(val side:Double): Shape4(){
    override fun area(): Double =side*side
    override fun drag()= println("Square4 is dragging")
}
class Triangle4(val base:Double,val height:Double):Shape4(){
    override fun area(): Double =0.5*base*height
    override fun drag()= println("Triangle4 is dragging")
}

class Player4(val name:String) :Draggable4{
    override fun drag()=println("$name is dragging")
    fun sayMyName()= println("Hey my name is - $name")
}