fun main() {
    println("Hello Shridhar".formattedString())
}
//Extension
fun String.formattedString():String{
        return "-----------\n$this\n------------"    //extension function jis bhi object pe call hoga, this usko point karega
}                                                  //this means current object