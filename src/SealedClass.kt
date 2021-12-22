import Tile.Blue

fun main() {
      val tile: Tile= Tile.Red("Mushroom", 25)
//      val tile2=Tile.Red("Fire",30)
//      println("${tile.points} - ${tile.type}")

      val points=when(tile){
          is Tile.Red ->tile.points*2
          is Blue -> tile.points*5

      }
    println(points)

}

sealed class Tile{
    class Red(val type:String, val points:Int) :Tile()
    class Blue(val points: Int): Tile()
}













//         enum               |     sealed
// we restrict values         | we restrict types
// only 1 object is made(i.e  | because there are multiple types so multiple objects can
// state remains same).       | be made and their state can be different.
