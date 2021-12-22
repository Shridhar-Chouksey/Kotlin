fun main() {

    val emp=Employee()
    //We don't have to do this
    emp.age=20
    emp.name="Shri"

    //We can do this using "apply"
    emp.apply {
        age=21
        name="Shridhar"
    }
//Inside scope,we have an object named 'this',which is pointing to the object(i.e emp)
//The return value of the function will be object only.
    println(emp)


}

data class Employee(var name:String="",var age:Int=18)