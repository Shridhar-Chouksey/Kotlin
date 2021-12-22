fun main() {
   add(1,2,3,4,5)
   add(1,1,1,1,1,1,1,1,1,1)
}

fun add(vararg values:Int){
     var sum=0
    for(i in values){
        sum+=i
    }
    println(sum)

}

//We can pass multiple no of parameters, and the corresponding variable(i.e values) will convert into an array(i.e value will become value[] of integers.
//Sometimes we need a function where we can pass n number of parameters, and the value of n can be decided at runtime.
//Kotlin provides us to achieve the same by defining a parameter of a function as vararg .