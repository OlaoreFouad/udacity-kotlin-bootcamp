import com.sun.org.apache.xpath.internal.operations.Bool
import java.util.Random

fun main(args: Array<String>) {
    println("Hello, ${args[0]}")
    feedTheFish()

    println(canAddFish(10.0F, listOf(3,3,3)))
    println(canAddFish(8.0F, listOf(2,2,2), hasDecoration = false))
    println(canAddFish(9.0F, listOf(1,1,3), 3))
    println(canAddFish(10.0F, listOf(), 7, true))
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)

    println("The fish eat $food on $day")

    if (shouldChangeWater(day)) {
        println("Change the water today!")
    }
}

fun randomDay(): String {
    val weeks = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return weeks[Random().nextInt(7)]
}

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun isTooHot(temp: Int) = temp > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"

fun fishFood(day: String): String {
    var food = "fasting"

    return when(day) {
        "Monday" -> "flakes"
        "Tuesday" -> "redworms"
        "Wednesday" -> "granules"
        "Thursday" -> "mosquitoes"
        "Friday" -> "plankton"
        "Saturday" -> "pellets"
        "Sunday" -> "lettuce"
        else -> food
    }
}

/*
* How many fish in a tank?
The most widely known rule for stocking a tank is the one-inch-per-fish-per-gallon-of-water rule. However that's assuming the tank doesn't have any decorations in it.

Typically, a tank with decorations can contain a total length of fish (in inches) less than or equal to 80% of the tank size (in gallons). A tank without decorations can contain a total length of fish up to 100% of the tank size.

For example:
A 10 gallon tank with decorations can hold up to 8 inches of fish, for example 4 x 2-inch-long fish.
A 20 gallon tank without decorations can hold up to 20 inches of fish, for example 6 x 1-inch-long fish and 2 x 2-inch-long fish.
fitMoreFish function
Create a function that takes these arguments:

tankSize (in gallons)
currentFish (a list of Ints representing the length of each fish currently in the tank)
fishSize (the length of the new fish we want to add to the tank)
hasDecorations (true if the the tank has decorations, false if not)
You can assume that typically a tank has decorations, and that a typical fish is 2 inches long. That means you can set those values as default parameters.*/

fun canAddFish(tankSize: Float, currentFish: List<Int>, fishSize: Int = 2, hasDecoration: Boolean = true): Boolean {
    var canAdd = false
    val fishTotalInches: Double
    var fishOccupiedInches = 0
    val fishAvailableInches: Int

    if (hasDecoration) {
        fishTotalInches = tankSize * 0.8
        for (fish in currentFish) {
            fishOccupiedInches = fishOccupiedInches.plus(fish)
        }

        fishAvailableInches = fishTotalInches.toInt() - fishOccupiedInches
        println("Fish to be added: $fishSize, Fish available: $fishAvailableInches, Fish Total inches: ${fishTotalInches.toInt()}, Fish Occupied: $fishOccupiedInches")
        canAdd = when(fishAvailableInches >= fishSize) {
            true -> true
            false -> false
        }
    } else {
        fishTotalInches = tankSize.toDouble()
        for (fish in currentFish) {
            fishOccupiedInches = fishOccupiedInches.plus(fish)
        }

        fishAvailableInches = fishTotalInches.toInt() - fishOccupiedInches
        println("Fish to be added: $fishSize, Fish available: $fishAvailableInches, Fish Total inches: ${fishTotalInches.toInt()}, Fish Occupied: $fishOccupiedInches")
        canAdd = when(fishAvailableInches <= fishSize) {
            true -> true
            false -> false
        }
    }

    return canAdd

}

fun canAddFish2(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize) // one liner!
}
