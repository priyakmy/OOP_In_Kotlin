
fun main(){
   // var circle= Circle(4.0) // It work as constructor
   // var square=Square(4.0)
  //  var circle:Shape=Circle(4.0) // In Ploymorphism reference should be parent class While objects are store in child class
  //  var square:Shape=Square(4.0)

   // println(circle.area())
   // println(square.area())

    val shapes= arrayOf(Circle(3.0),Square(4.0),Triangle(4.0,3.0))

   calculateArea(shapes)

}
fun calculateArea(shapes :Array<Shape>){
    for(shape in shapes){
        println(shape.area())
    }
}
open class Shape(){
    open fun area():Double{
        return 0.0

    }

}
class Circle(var radius:Double): Shape() {
    override fun area():Double {
        return Math.PI*radius
    }
    }


class Square(var side:Double):Shape(){
    override fun area():Double{
        return side*side
}
}
class Triangle(var base:Double,var height:Double):Shape(){
    override fun area():Double{
        return 0.5*base*height
    }

}