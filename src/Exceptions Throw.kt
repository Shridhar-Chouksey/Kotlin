import java.lang.IllegalArgumentException

fun main() {
     createUserList(5)
     createUserList(-2)
}

fun createUserList(count: Int){
    if(count<0){
        //Exception raise
        throw IllegalArgumentException("Count must be greater than 0")
    }
    else{
        println("User list created containing $count users")

    }
}