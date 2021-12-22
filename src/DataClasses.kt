fun main() {
    val p1= Person3(1,"Shri")
    val p2= Person3(1,"Shri")

    val p3=p1.copy(id=3)
    println(p3)


    //Component n functions or Destructuring
    val (id,name)=p1
    println(id)
    println(name)
    println(p1.component1())

}

data class Person3(val id:Int,val name:String){

}