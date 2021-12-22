fun main() {

    val emp=Employee6()

    emp.age=20
    emp.name="Shri"

    //In 'run',the return value of the scope will be the return value of the last statement
    emp.run{
        age=21
        name="PQR"

    }

    println(emp)


}

data class Employee6(var name:String="",var age:Int=18)