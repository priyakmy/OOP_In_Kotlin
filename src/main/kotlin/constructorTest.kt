fun main() {
    val emp = employee(18018, "Sagnik")
    val emp2 = employee(11011)

    val emp3 = employee()
}

class employee(emp_id : Int = 100 , emp_name: String = "abc") {
    val id: Int
    var name: String

    // initializer block
    init {
        id = emp_id
        name = emp_name

        print("Employee id is: $id, ")
        println("Employee name: $name")
        println()
    }
}
