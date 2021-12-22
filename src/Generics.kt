fun main() {
    val obj=IntContainer(3)
    obj.getValue()
    val iContainer=Container<Int>(3)
    iContainer.getValue()
    val sContainer=Container<String>("Shri")
    
}

class Container<T> (var data: T){

    fun setValue(value: T){
        data=value
    }
    fun getValue(): T{
        return data
    }
}

class IntContainer(var data:Int){

    fun setValue(value: Int){
        data=value
    }
    fun getValue(): Int{
        return data
    }
}

class StringContainer(var data:String){

    fun setValue(value: String){
        data=value
    }
    fun getValue(): String{
        return data
    }
}