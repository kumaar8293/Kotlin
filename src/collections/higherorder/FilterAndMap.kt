package collections.higherorder

import java.util.*


/**
 * FILTER : Returns a List Containing Only Elements matching the given [Predicate]
 *
 * MAP : Return a List Containing the results of applying the given [Transform] function
 * to each element in the original collection
 */
fun main() {

    val myList = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    val mySmallNumbers = myList.filter { it < 5 }

    mySmallNumbers.forEach(::println)

    val mySquaredNumber = myList.map { it * it }
    mySquaredNumber.forEach(::println)
    mySquaredNumber.forEach {
        it.printValue()
    }

    myList.filter { it < 5 }.map { it * it }.forEach(::println)

}

fun Any.printValue(){
    println("Number is $this")
}