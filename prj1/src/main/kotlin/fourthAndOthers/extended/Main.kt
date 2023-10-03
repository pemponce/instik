package fourthAndOthers.extended

fun main(args:Array<String>) {

    val type = readln()
    val weight = readln().toInt()
    val color = readln()
    val name = readln()

    val pet = UrPet(type, weight, color, name)

    pet.sayGav()

    pet.sayAllWothoutName()

    pet.image
}