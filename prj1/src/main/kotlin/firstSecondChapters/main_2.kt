package firstSecondChapters

fun main(args: Array<String>) {
    var x = readln().toInt()
    println("Before the loop. x = $x.")
    while (x < 4) {
        println("In the loop. x = $x.")
        x = x + 1
    }
    println("After the loop. x = $x.")
}