fun main(){
    val obj= OnePlus()
    obj.makecall()


}
open class Mobile( val type:String) {
    val name: String = ""
    val size = 5

    fun makecall() = println("Calling from Mobile")
    fun poweoff() = println("Shutting Down")
    open fun display() = println("Simple Mobile Display")
}
class OnePlus:Mobile( "Smart Phone"){
    override fun display() = println("Onr Plus Display")
    }

