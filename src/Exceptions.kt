fun main() {

       val arr= arrayOf(1,2,3)

         try{
             println(arr[5])
         }
         catch (ex: NullPointerException){
             println("Please check null pointer error")
         }
         catch (e: Exception){
            println("Please check the array index")
         }
         finally {
            println("This will run no matter what")
         }


}



//Note in multiple catch blocks, first write specific catches,then write the generic catch at the end.
//We can never write single try block,
//either we have to write try with catch or try with finally