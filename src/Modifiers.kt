fun main() {
    val obA=As()
    val obB=B()

}

open class As{
    public var p=10
    private var q=20
    internal var r=30
    protected var s=40
}

class B: As(){

      fun test(){
          println(p)
        //  println(q)    //error because q is not accessible as its private
          println(r)
          println(s)    //s is accessible inside its subclass
      }
}




//By default, all the functions,variables,class are public in nature.
//Internal behaves like public but within a module(eg: our that particular kotlin project or it can be maven module also)
//"MODIFIERS"    |   "TOP LEVEL DECLARATIONS"
// public        |          Everywhere
// internal      |       With in a module
// private       |         With in file
// protected     |              N/A

//protected will work inside the classes and will only be available inside sub classes
//private on a member inside the class, can't be called outside that class