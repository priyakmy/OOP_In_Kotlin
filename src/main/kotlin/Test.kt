

fun main(args: Array<String>) {
    CEO("Satya Nadela", 48, 250.00)
}
open class Employee {
    constructor(name: String,age: Int){
        println("Name of the Employee is $name")
        println("Age of the Employee is $age")
    }
}
// derived class
class CEO : Employee{
    constructor( name: String,age: Int, salary: Double): super(name,age) {
        println("Salary per annum is $salary million dollars")
    }
}

