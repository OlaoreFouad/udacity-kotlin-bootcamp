import java.util.*

fun main(args: Array<String>) {
    println("Hello, world!")

    println("Good ${ if (args[0].toInt() < 12) "morning" else "night!" }")

    val time = args[0].toInt()
    greet(time)
    dayOfWeek()
}

fun greet(time: Int) {
    println("Good ${ if (time < 12) "morning" else "night!" }, Kotlin!")
}


fun dayOfWeek() {
    println("What day is it today?")
    val dayIndex = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    val day = when(dayIndex) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "No day!"
    }

    println("Today is: $day")
}