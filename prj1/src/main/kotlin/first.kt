//fun dog.main(args: Array<String>) {
//    var x = readln().toInt()
//    while (x > 3) {
//        println(x)
//        x = x - 1
//    }
//    var z = readln().toInt()
//    while (z == 10) {
//        println(z)
//        z = z + 6
//    }
//}

//fun dog.main(args: Array<String>) {
//    var x = readln()
//    println("Before the loop. x = $x.")
//    while (x < 4) {
//        println("In the loop. x = $x.")
//        x = x + 1
//    }
//    println("After the loop. x = $x.")
//}

//fun dog.main(args: Array<String>) {
//    val x = readln()
//    val y = readln()
//
//    if(x > y) {
//        println("$x is greater than $y")
//    } else {
//        println("$x is not greater than $y")
//    }
//    println("This line runs no matter what")
//}

//fun dog.main(args: Array<String>) {
//    val x = readln()
//    val y = readln()
//
//    println(if(x > y) "$x is greater than $y" else "$x is not greater than $y")
//    println("This line runs no matter what")
//}


//fun dog.main(args: Array<String>) {
//    var x = 1
//    while (x < 3) {
//        println( if (x == 1) "Yab" else "Dab")
//        println("ba")
//        x = x + 1
//    }
//    if (x == 3) println("Do")
//}


//fun dog.main(args: Array<String>) {
//    var x = 110
//    var z: Int = x - 1
//
//    println("$z")
//}

//fun dog.main(args: Array<String>) {
//    var x: Int = 110
//    var z: Long = x.toLong() - 1
//
//    println("$z")
//}

//fun dog.main(args: Array<String>) {
//    var x = 53L
//    var z: Int = x.toInt() - 1
//
//    println("$z")
//}


//fun dog.main(args: Array<String>) {
//    var x = 1234567890123L
//    var z: Int = x.toInt()
//
//    println("$z")
//}


//fun dog.main(args: Array<String>) {
//    var x =  65.2F
//    var isPunk = true
//    val message = "Hello"
//    var y = 7
//    var z: Int = y
//    y = y + 50
//    var s: Short
//    var bigNum: Long = y.toLong()
//    var b: Byte = 2
//    var smallNum = b.toShort()
//    b = smallNum.toByte()
//    isPunk = false
//    var k = y.toDouble()
//    b = k.toInt().toByte()
//    s = 0b10001
//}


//fun dog.main(args: Array<String>){
//    val wordArray1 = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
//    val wordArray2 = arrayOf("empowered", "leveraged", "aligned", "targeted")
//    val wordArray3 = arrayOf("process", "paradigm", "solution", "portal", "vision")
//    val arraySize1 = wordArray1.size
//    val ssas = (Math.random() * arraySize1)
////    println(ssas)
////    println(ssas.toInt())
//    val arraySize2 = wordArray2.size
//    val arraySize3 = wordArray3.size
//    val rand1 = (Math.random() * arraySize1).toInt()
//    val rand2 = (Math.random() * arraySize2).toInt()
//    val rand3 = (Math.random() * arraySize3).toInt()
//    val phrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"
//    println(phrase)
//}


//fun dog.main(args: Array<String>) {
//    var arr = arrayOf(1, 2, 3)
//
//    println(arr[2])
//}2

//fun dog.main(args: Array<String>) {
//    var myAr: Array<Byte> = arrayOf(1, 2, 3)
//
//    println(myAr[1])
//}

//fun dog.main(args: Array<String>) {
//    val hobbits = arrayOf("Frodo", "Sam", "Merry", "Pippin")
//    var x = 0
//    while (x < 4) {
//        println("${hobbits[x]} is a good Hobbit name")
//        x = x + 1
//    }
//}

//fun dog.main(args: Array<String>) {
//    val firemen = arrayOf("Pugh", "Pugh", "Barney McGrew", "Cuthbert", "Dibble", "Grub")
//    var firemanNo = 0
//    while (firemanNo < 6) {
//        println("Fireman number $firemanNo is " + firemen[firemanNo])
//        firemanNo = firemanNo + 1
//    }
//}


//fun dog.main(args: Array<String>) {
//
//    val index = arrayOf(1, 3, 4, 2)
//    val fruit = arrayOf("Apple", "Banana", "Cherry", "Blueberry", "Pomegranate")
//    var x = 0
//
//    var y: Int
//
//    while (x < 4) {
//        y = index[x]
//        println("Fruit = ${fruit[y]}")
//        x = x + 1
//    }
//}