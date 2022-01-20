//There are situations where we often declare our variable but we dont use it, this is a waste of memory
val pi: Float? by lazy {
     3.14f
}
    fun main(args: Array<String>) {

        println("Some initial code.....")
        val area1 =pi * 4 * 4

        val area2 =pi * 9 * 9             //this time it wouldn't be initialised, the value would be loaded from cache memory which got saved when used first time.
        println("Some more code....")

    }


//By lazy means unless you use it would not be initialised
//In case of Lazy initialisation, we can make it nullable type by placing "?" after data type, it is upto our wish we want to set it as nullable or non-nullable.
//It is thread safe: initialised in the thread, when it is used for the first time, other threads use same value stored in cache.
//the variable can be var or val.