fun main() {

    var a1=Automobile("r",4,5,"sdf")
    var a2=Automobile("ar","ch")
 
}

class Automobile(val name:String,val tyres:Int, val maxSeating:Int ,val engineType:String){

   init {
       println("Hello shri")
   }
    init {
        println("hello ji")
    }

    //secondary constructor: while making it note you always call primary constructor using "this"

    constructor(nameParam:String,engineParam:String):
         this(nameParam,4,5,engineParam)



}