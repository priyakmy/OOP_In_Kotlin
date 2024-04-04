fun main(){

    val red =Red("Fire",25)
    val blue=Blue("Bubbles",10)
    println("${red.type},${red.points}")
    println(blue.points)

}

sealed class Tiles
class Red(val type:String, val points:Int):Tiles()
class Blue(val type:String, val points:Int): Tiles()
