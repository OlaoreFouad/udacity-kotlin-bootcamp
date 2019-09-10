import java.util.*

var rollDice = { sides: Int -> if (sides.equals(0)) 0 else Random().nextInt(12) }

fun main(args: Array<String>) {
    println(rollDice(2))
    println(rollDice(0))

    var rollDice2: (Int) -> Int
    gamePlay(rollDice(3))
    gamePlay(rollDice(8))
}

fun gamePlay(diceRoll: Int) {
    println(diceRoll)
}