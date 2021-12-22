fun main() {
    val nexon=Car("nexon","petrol",100)
    val creta=Car("creta","diesel",200)

    println(nexon.driveCar())
     println(nexon.name)
     println(creta.unitlong)
}

class Car(val name: String,val type: String,val unitlong: Int){

    fun driveCar(){
        println("$name Car is driving")
    }
    fun applyBrakes(){
        println("Applied Brakes")
    }

}