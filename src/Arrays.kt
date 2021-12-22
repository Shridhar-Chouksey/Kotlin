fun main() {

    var arr= arrayOf("Zero","One","Two")
    var arr1= arrayOf(1,2,3)
    var arr2= arrayOf(3,4,5)

    for(i in arr){
        print(" "+i)
    }
    println()

    for((i,e) in arr.withIndex()){
        println("$i - $e")
    }

    arr.set(2,"two")
    println(arr[2])
}