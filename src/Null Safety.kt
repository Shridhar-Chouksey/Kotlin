fun main() {
     var gender:String="Male"
     var gender2:String?=null
     var isAdult: Boolean?=true
     //gender2 is now nullable type means it can accept null values also

    if (gender2 != null) {
        gender2.toUpperCase()
    }
    println(gender2?.toUpperCase()) //To not do like above if calls, we introduced safe calls so that even if it is null it can be printed
                                    //In the if calls it will be null and inside call will not run, but with safe call it will run.


    gender2?.let{
        println("Line 1")
        println("Line 2 $gender2")
        println("Line 3 $it")         //'it' will refer to gender2 (the one on which let is applied)
    }


    //Elvis operator / Null Coalescing
    var selectedValue=gender2?:"NA"  //If gender2 is null,it will take NA as value otherwise it will take the value which was assigned to it.

    //Not Null Asserted Operator
    var value= gender2!!.toUpperCase()  //If object is not null, then call the function otherwise return error



}


//let can be called both using and without using safe operator.
//advantage of using let with "safe operator" is there is a assurance that inside let there will be object which will be non nullable
