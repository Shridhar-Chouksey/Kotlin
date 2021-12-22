fun main() {

    val p1=Person("s",21)
    println(p1.age)
    p1.age=5
    p1.age=12

}

class Person(nameParam:String,ageParam:Int){
    var name:String=nameParam

    get() {
        println("Name getter is called")
        return field.toUpperCase()
    }


    var age:Int=ageParam
//apply setter to do validation, to check what we are sending
    set(value){
      if(value>18){
        field=value
    }
    else{
        println("Under age")
      }
}

    //default syntax
    var email:String=""
    get() = field
    set(value){
        field=value
    }


}