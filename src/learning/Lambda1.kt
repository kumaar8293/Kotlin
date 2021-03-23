package learning

import java.util.function.Consumer


fun main() {
    val data = listOf(1, 4, 5, 6, 0, 8)

    val consumer: Consumer<Int> = object : Consumer<Int> {
        override fun accept(t: Int) {
            println(t)
        }
    }

    val consumer2: Consumer<Int> = Consumer<Int> { t: Int -> println(t) }

//    data.forEach({number:Int -> println(number)})
//    data.forEach({number -> println(number)})
//    data.forEach({ println(it)})
//    data.forEach{ println(it)}
//    data.forEach(::println) //Method references
    data.forEach(::test)
//    data.forEach {
//        test(it)
//    }
//    data.forEach({ test(it) })
}

fun test(value: Int) {
    if (value > 5) {
        println("Values is greater than 5")
    } else {
        println("Values is less than 5")
    }
}