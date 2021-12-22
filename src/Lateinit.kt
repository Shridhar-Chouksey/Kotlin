fun main() {

    val obj=Calculator()
    println(obj.add(2,3))

}
class Calculator {
    //note: lateinit cannot be val, cannot be integer ,boolean ,float.
    lateinit var message:String
    fun add(a: Int, b: Int): Int {
        return a+b
    }

}