fun main() {
         var obj=A5.factory()
         obj.show()

}

class A5{

      fun show(){
          print("in show")
      }

    companion object{
        fun factory():A5=A5()
    }



}