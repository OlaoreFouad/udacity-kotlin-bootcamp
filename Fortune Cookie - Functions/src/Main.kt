fun main(args: Array<String>) {
    println("Welcome to Fortune Cookie Program!")
    println("Your fortune is: ${ getFortuneCookie() }")
}

fun getFortuneCookie(): String {
    val fortunes = listOf("You will have a great day!", "Things will go well for you today.",
        "Enjoy a wonderful day of success.", "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.", "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")

    print("Enter your birthday: ")
    val birthday = readLine()!!.toIntOrNull()

    val fortuneCookieIndex = birthday?.rem(fortunes.size) ?: 1
    return fortunes[fortuneCookieIndex]
}