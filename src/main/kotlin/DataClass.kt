data class person (val name:String, val age:Int) {
}
/*fun main(){
    val priya= person("Priya",26)
    println("Name =  ${priya.name}")
    println("Age= ${priya.age}")
} */

/* Use Of Copy Function
fun main(args: Array<String>) {
    val u1 =person("Priya", 26)

    // using copy function to create an object
    val u2 = u1.copy(name = "Piku")

    println("u1: name = ${u1.name}, name = ${u1.age}")
    println("u2: name = ${u2.name}, name = ${u2.age}")
}

// Use of toString function
fun main() {
    val u1 = person("Priya", 26)
    println(u1.toString())
} */

fun main() {
val u1 = person("Priya", 29)
val u2 = u1.copy()
val u3 = u1.copy(name = "Piya")

println("u1 hashcode = ${u1.hashCode()}")
println("u2 hashcode = ${u2.hashCode()}")
println("u3 hashcode = ${u3.hashCode()}")

if (u1.equals(u2) == true)
println("u1 is equal to u2.")
else
println("u1 is not equal to u2.")

if (u1.equals(u3) == true)
println("u1 is equal to u3.")
else
println("u1 is not equal to u3.")
}