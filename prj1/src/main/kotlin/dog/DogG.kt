package dog

import java.util.StringJoiner

class DogG {
    class Dog(val name: String, val model: String, var age: Int, private var password: String) {

        fun bark() {
            println("WWOOOFF")
        }

        fun toStr() {
            println("$name $model $age password: $password");
        }
    }
}

