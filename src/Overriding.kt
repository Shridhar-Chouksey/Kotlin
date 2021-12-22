fun main() {
     val oneplus=OnePlus("SmartPhone")
     oneplus.display()
     println(oneplus.toString())
}

open class Mobile(val type:String){

    open val name: String=""
    open val size:Int=5

    fun makeCall()= println("Calling from Mobile")
    fun powerOff()= println("Shutting Down")
   open fun display()= println("Simple Mobile Display")
}

class OnePlus(typeParam:String): Mobile(typeParam) {

    override val name: String = "One Plus"
    override val size: Int = 6

    override fun display() {
           super.display()
        println("One Plus Display")
    }

    override fun toString(): String {
        return "OnePlus(name='$name', size=$size)"
    }


}