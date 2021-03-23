package lambda

import java.util.function.Consumer

fun main() {
    val list = listOf<Int>(1, 2, 4, 5, 6, 7, 3, 2)

    for (item in list) {
        println(list)
    }

    list.forEach({ println(it) })

//    list.forEach(Consumer {  })

    val consumer :Consumer<Int> = object : Consumer<Int>{
        override fun accept(t: Int) {

        }
    }

    list.forEach(consumer)


    list.forEach({t -> println(t)})
    list.forEach({ println(it)})
    list.forEach(::println) // Method reference
}