fun main() {
   val obj=Outer()
    obj.i

//To access Nested class functions when nested class is not 'inner'(i.e when it is not accessing any variables of its outer class)
//val nested =Outer.Nested()
//nested.test()

//To access nested class functions when it is inner and using variables or properties of outer class.
    val inner=Outer().Nested()
    inner.test()
}

class Outer{
    var i=0
      inner class Nested{
          fun test(){
              println("I am in nested class $i")
          }
      }
}
//Nested class can not access variables, properties of outer class, you have to make nested class using 'inner' keyword.
//Nested class don't have any existence of its own, but it will always go with outer class.

//Application: used in Recycler View when we define Adapter.