package firstSecondChapters

fun main(args: Array<String>) {
    val x = readln()
    val y = readln()

    if(x > y) {
        println("$x is greater than $y")
    } else {
        println("$x is not greater than $y")
    }
    println("This line runs no matter what")
}
