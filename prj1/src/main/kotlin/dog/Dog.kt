package dog

fun main(args: Array<String>) {
    val password: String
    password = readln()
    val dog = DogG.Dog("Martin", "Shavka", 70, password)


    dog.age = 122
    dog.toStr()
    dog.bark()
}