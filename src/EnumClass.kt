fun main() {
  val day=Day.SUNDAY
    println(day)
    println(day.no)
    day.printFormattedDay()
}
enum class Day(val no:Int){
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    fun printFormattedDay() {
        println("Day is $this")
        //In a member of a class, this refers to the current object of that class.
    }
}

//enum class means only a set of values(eg days in a a week) can be passed to a variable and not any random value