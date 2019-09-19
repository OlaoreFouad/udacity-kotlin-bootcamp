package classes

open class Aquarium {

    var width: Int = 20
    var height: Int = 20
    var length: Int = 15

    open fun volume() = (width.times(height).times(length)) / 1000

    open var water = volume() * 0.9

}

class TowerTank : Aquarium() {
    override var water = volume() * .8

    override fun volume() = 234
}