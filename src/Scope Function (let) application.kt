fun main() {

    val emp: Employee5? =null
   emp?.age=20
   emp?.name="Shri"

    //With the below way you don't have to apply safe call again and again,
    //So inside the scope we will get non null object, no need to apply safe call inside 'let' , when safe call is already applied outside.
    emp?.let {
        it.age=20
        it.name="Shri"
    }

    println(emp)


}

data class Employee5(var name:String="",var age:Int=18)