fun main() {
   var ObjChild=Child()
}

open class Parent{

    init {
        println("Parent's constructor is called")
    }

    val name:String=""

    fun myMethod(){
        println("I am in Parent")
    }

}

class Child: Parent(){

    init {
        println("Child's constructor is called")
    }
    val name2:String=""

    fun myMethod2(){
        println("I am in Child")
    }

}