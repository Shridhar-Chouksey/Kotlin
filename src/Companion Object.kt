fun main() {

//    MyClass.MyObject.f()
    MyClass.f()
    MyClass.AnotherObject.g()
}

class MyClass{

    companion object MyObject{
        @JvmStatic     // we have to mention this if we have to access this in java file
        fun f(){
             println("Hello I am F from Object")
        }
    }
    object AnotherObject{
          fun g(){
              println("Hello I am G from another Object")
          }
    }
}

// This file results are shown using MainJava.java file
// We have terminology 'static' in java, 'companion' in kotlin
// Note:One class can have only 1 companion
// companion means simply like a friend to access it items but we dont need to ask him