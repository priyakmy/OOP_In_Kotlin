fun main() {
    val eng = Engineer("Priya",1)
    eng.employeeDetails()
    eng.dateOfBirth("02 December 1998")
}
//abstract class
abstract class Emp(val name: String,val experience: Int) { // Non-Abstract

    abstract var salary: Double

    abstract fun dateOfBirth(date:String)

    // Non-Abstract Method
    fun employeeDetails() {
        println("Name of the employee: $name")
        println("Experience in years: $experience")
        println("Annual Salary: $salary")
    }
}
// derived class
class Engineer(name: String,experience: Int) : Emp(name,experience) {
    override var salary = 500000.00
    override fun dateOfBirth(date:String){
        println("Date of Birth is: $date")
    }
}

