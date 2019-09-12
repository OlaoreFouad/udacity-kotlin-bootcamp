package classes

class Spice(var name: String, var spiciness: String = "mild") {
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

    init {
        println("Name: $name, Spiciness: $spiciness, Heat: $heat")
    }
}