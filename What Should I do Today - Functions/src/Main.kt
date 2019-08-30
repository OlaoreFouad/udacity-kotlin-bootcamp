fun main(args: Array<String>) {
    println(whatShouldIDoToday(weather = "cloudy"))
}

fun whatShouldIDoToday(mood: String = readLine()!!, weather: String = "sunny", temp: Int = 24): String {
    return when {
        isSadAndSunny(mood, weather) -> "Go to a friend's or call one!"
        isRainy(mood, weather) -> "Watch Netflix!"
        isCloudy(mood, weather) -> "Sleep in!"
        mood == "bored" && weather == "rainy" -> "Play Games"
        else -> "Just Read Qur'an"
    }
}

fun isRainy(mood: String, weather: String) = mood == "happy" && weather == "rainy"

fun isSadAndSunny(mood: String, weather: String) = mood == "sad" && weather == "sunny"

fun isCloudy(mood: String, weather: String) = mood == "happy" && weather == "cloudy"