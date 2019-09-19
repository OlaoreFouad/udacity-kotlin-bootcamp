import classes.Aquarium
import classes.SimpleSpice
import classes.Spice
import classes.SpiceContainer

fun main(args: Array<String>) {

    val sc1 = SpiceContainer("curry")
    val sc2 = SpiceContainer("thyme")
    val sc3 = SpiceContainer("mayo")

    println(sc1)
    println(sc2)
    println(sc3)

    //buildAquarium()
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
