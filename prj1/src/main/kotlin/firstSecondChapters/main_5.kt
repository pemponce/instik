package firstSecondChapters

fun main(args: Array<String>) {
    var x = 1
    while (x < 3) {
        println( if (x == 1) "Yab" else "Dab")
        println("ba")
        x = x + 1
    }
    if (x == 3) println("Do")
}