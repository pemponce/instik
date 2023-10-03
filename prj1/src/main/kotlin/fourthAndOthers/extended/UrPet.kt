package fourthAndOthers.extended


class UrPet(type_params: String, weight_param: Int, color_param: String, name_param: String):
    Animal(type_params, weight_param, color_param) {
    val name = name_param

    fun sayGav() {
        println("Gav Gav\nmy Name is $name")
    }

    fun sayAllWothoutName() {
        println("im $type and $weight kg, im $color")
    }

    init {
        image = "C:\\Users\\azhel\\Pictures\\Saved Pictures\\Iff.jpg"
    }
}