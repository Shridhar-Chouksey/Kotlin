fun main() {

    val emp=Employee3()

    emp.age=20
    emp.name="Shri"

    //In 'with',the return value of the scope will be the return value of the last statement
    with(emp){
        age=21
        name="XYZ"
    }

    println(emp)


}

data class Employee3(var name:String="",var age:Int=18)