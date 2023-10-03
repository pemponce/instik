package firstSecondChapters

fun main(args: Array<String>) {
    var x = readln().toInt()
    while (x > 3) {
        println(x)
        x = x - 1
    }
    var z = readln().toInt()
    while (z == 10) {
        println(z)
        z = z + 6
    }
}