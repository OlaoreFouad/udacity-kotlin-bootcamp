fun main() {
    operators()

    variables()

    null_lists()

    null_checks()
}

fun operators() {
    println("Welcome to Operators Section")
    var fishes = 2
    var leftFishes = fishes.plus(71).plus(233).minus(13)

    println("There would be $leftFishes left")

    var aquariums = leftFishes.div(30)
    println("We would need $aquariums aquariums")
}

fun variables() {
    var rainbowColor: String? = "blue"

    rainbowColor = null

    val blackColor = "black"
    var greenColor: String? = null
    var blueColor: String? = null
}

fun null_lists() {
    var mList = listOf<String?>(null, null)
    var mList2: List<String?> = listOf(null, null)

    var mmList: List<String?>? = null
}

fun null_checks() {
    var nullTest: Int? = null
}