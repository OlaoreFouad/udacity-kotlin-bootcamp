import classes.Aquarium
import classes.SimpleSpice
import classes.Spice

fun main(args: Array<String>) {
    buildAquarium()
}

fun buildAquarium() {
    val aquarium = Aquarium()

    println("Width: ${aquarium.width}, Height: ${aquarium.height}, Length: ${aquarium.length}")

    val spice = SimpleSpice()
    println("Name: ${spice.name}, Heat: ${spice.heat}")

    val spices = listOf<Spice>(
        Spice("curry"), Spice("thyme", "vague"), Spice("ata lasan", "very spicy"), Spice("tumeric", "vague"), Spice("maggi"), Spice("ata gigun", "spicy")
    )

    val verySpicySpices = spices.filter { it.heat > 5 }
    val notVerySpicySpices = spices.filter { it.heat <= 5 }

    println("Very spicy spices!")
    verySpicySpices.forEach { println("Name: ${ it.name }, Heat: ${ it.heat }") }
    println("Not very spicy spices!")
    notVerySpicySpices.forEach { println("Name: ${ it.name }, Heat: ${ it.heat }") }

}

fun makeSalt() = Spice("salt", "vague")
