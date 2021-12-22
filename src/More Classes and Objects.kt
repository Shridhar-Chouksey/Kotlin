fun main() {

    val p1=Vote("SHRIDHAR",19)
    val p2=Vote("Suresh",16)
    println(p1.canVote())
    println(p2.canVote())

}

class Vote(val name: String, val age: Int){

    fun canVote(): Boolean{
        return age>18

    }


}