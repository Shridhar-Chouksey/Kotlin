fun main() {

//    MyClass.MyObject.f()
    MyClass.f()
    MyClass.AnotherObject.g()
}

class MyClass{

    companion object MyObject{
        @JvmStatic
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


//We have terminology 'static' in java, 'companion' in kotlin