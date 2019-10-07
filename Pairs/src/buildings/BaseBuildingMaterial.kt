package buildings

fun main(args: Array<String>) {
    val wood = Wood()
    val building = Building(wood)

    building.build()
}

open class BaseBuildingMaterial(var numberNeeded: Int = 1) {
    fun <T: BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
        if (building.baseMaterialsNeeded < 500) println("Small building!") else println("Large building")
    }
}

class Wood: BaseBuildingMaterial(4)

class Building<T: BaseBuildingMaterial>(var buildingMaterial: T) {
    var baseMaterialsNeeded = 100

    fun actualMaterialsNeeded() = baseMaterialsNeeded - buildingMaterial.numberNeeded

    fun build() {
        println("The type of the material is ${ buildingMaterial::class.simpleName } and i would be needing ${ actualMaterialsNeeded() } materials!")
    }

}