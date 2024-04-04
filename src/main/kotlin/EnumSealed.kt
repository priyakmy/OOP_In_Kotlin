fun main() {
    val day = Day.SUNDAY
    println(day.number)
    val day1 = Day.MONDAY
    println(day1.number)

    for( i in Day.values()){
        println(i )
    }
}

enum class Day(val number: Int) {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7)
}

fun Day.printFormatDay() {
    println("Day is $this")
}
