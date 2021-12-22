fun main() {

    val emp=Employee2()
    emp.age=20
    emp.name="Shri"

    //We don't have to do this like below
    println(emp.age)
    println(emp.name)

    //We can do this using "let"
   emp.let {
        println(it.age)
        println(it.name)
    }
    //'it' will point to "emp"
    //In 'let',the return value of the scope will be the return value of the last statement
    println(emp)

}

data class Employee2(var name:String="",var age:Int=18)