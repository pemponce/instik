fun main(args: Array<String>) {

    val recResult = recFactorial(2)
    val forResult = forFactorial(2)

    println("recResult=${recResult}")
    println("forResult=${forResult}")

}

fun forFactorial(num: Int): Double {

    if (num < 0) return Double.NaN

    var result = 1.0

    for (index in 1..num)
        result *= index

    return result
}

fun recFactorial(num: Int): Double {

    if (num == 0) return 1.0
    else if (num < 0) return Double.NaN

    return num * recFactorial(num - 1)
}