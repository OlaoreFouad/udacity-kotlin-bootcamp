package spices

fun main(args: Array<String>) {
    val curry = Curry("curry")
    println(curry.color)
}

/*
* Making the Spice class a sealed class, disallows subclassing of the Spice class in any other file, this allows Kotlin to know beforehand about all the classes that subclassed the sealed class.
* */

abstract sealed class Spice(var name: String, var spiciness: String = "mild") {
    var heat: Int = 0
        get() {
            return when(spiciness) {
                "mild" -> 5
                "spicy" -> 10
                "vague" -> 0
                "very spicy" -> 15
                else -> 0
            }
        }

    abstract fun prepareSpice()

    init {
        println("Name: $name, Spiciness: $spiciness, Heat: $heat")
    }
}

class Curry(name: String, spiciness: String = "mild", spiceColor: SpiceColor = YellowSpiceColor):
    Spice(name, spiciness), Grinder by DefaultGrinder, SpiceColor by spiceColor {
    override fun prepareSpice() {
        println("curry is being prepared!")
    }
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    var color: Color
}

object YellowSpiceColor: SpiceColor {
    override var color = Color.YELLOW
}

object DefaultGrinder: Grinder {
    override fun grind() {
        println("curry is not grindable!")
    }
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00)
}