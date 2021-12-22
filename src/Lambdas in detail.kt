import javax.imageio.metadata.IIOMetadataNode
fun main() {
      var fn:(a:Int,b:Int)->Int=::sum
      val lambda1={x:Int,y:Int -> x+y}
      val multiLineLambda ={
          println("Hello Lambda")
          val a=2+3
          "Hello Shridhar"
          2
      }

          val singleParamLambda={x:Int->x*x}

    //type declaration is not always necessary if we have previously defined it is of which type
          val lambda2: (Int)->Int={x->x*x}

          val sayHi={msg:String-> println("Hello $msg")}
          val sayHi2: (String)->Unit ={msg-> println("Hello $msg") }


    multiLineLambda()
}

fun sum(a:Int,b:Int):Int=a+b

fun calculator(a:Int,b:Int, op:(Int,Int)->Int):Int{
   return op(a,b)
}




//Lambdas are anonymous functions,i.e those functions which don't have any name
