fun main() {
    calculateTimeAndRun {
        loop(1000000)
    }
}

inline fun calculateTimeAndRun(fn:()->Unit)
{
    val start=System.currentTimeMillis()
    fn()
    val end=System.currentTimeMillis()
    println("Time taken ${end - start} ms")

}
fun loop(n:Long){
    for(i in 1..n){

    }
}

//Inline function enhances the performance of higher order function
//An inline function is one for which the compiler copies the code from the function definition directly into the code of the calling function rather than creating a separate set of instructions in memory. This eliminates call-linkage overhead and can expose significant optimization opportunities.