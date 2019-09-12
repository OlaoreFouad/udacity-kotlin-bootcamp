package classes

class Aquarium {

    var width: Int = 20
    var height: Int = 20
    var length: Int = 15

    fun volume() = (width.times(height).times(length)) / 1000

}