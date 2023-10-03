package firstSecondChapters

fun main(args: Array<String>) {
    val x = readln()
    val y = readln()

    println(if(x > y) "$x is greater than $y" else "$x is not greater than $y")
    println("This line runs no matter what")
}