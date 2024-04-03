fun main(){
    val obj= Button()
    obj.onTouch()
    obj.onClick()

}

interface MyInterfaceListener{
    var name:String
    abstract fun onTouch()
    fun onClick(){
        println("onclick Interface code: Button clicked")

    }
}
class Button: MyInterfaceListener {
    override var name: String =" Dummy_Name"

    override fun onTouch() {
        println("Butoon Was Touched")
    }

    override fun onClick() {
        super.onClick()
        println("Butoon Was Clicked")
    }

}