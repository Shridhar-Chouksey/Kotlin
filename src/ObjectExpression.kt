//Object Expression: Anonymous objects using object keyword
fun main() {
    var obj2= object : Person2("shridhar"){
          override fun fullName() {
                super.fullName()
                println("Anonymous- $name")
          }
    }
      obj2.fullName()
}

open class Person2(val name:String){
     open fun fullName()= println("Full Name- $name")
}