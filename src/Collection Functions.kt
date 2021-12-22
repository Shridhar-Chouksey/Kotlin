fun main() {
     val nums= listOf(1,2,3,4,5)

     val userList= listOf(
          User(1,"A"),
          User(2,"B"),
          User(3,"C")
     )

    println(userList.filter { it.id==2 })

    val list=nums.map { it * it }
    val paiduserlist=userList.map{
        paidUserList(it.id,it.name,"Paid")
    }
println(paiduserlist)



//forEach are used to perform action on each and every elements of list
   nums.forEach { println(it) }


}

data class User(val id:Int,val name:String)
data class paidUserList(val id:Int,val name:String,val type:String)