package collections


/**
 * Array are mutable but fixed size
 * There are two ways to define an Array in Kotlin.
 *
 *  A => Using the arrayOf() function –>
 *        We can use the library function arrayOf() to create an array by passing the values
 *        of the elements to the function.
 *        Example:  val num = arrayOf(1, 2, 3, 4)   //implicit type declaration
 *                  val num = arrayOf<Int>(1, 2, 3) //explicit type declaration
 *
 *  B => Using the Array constructor –>
 *         Since Array is a class in Kotlin, we can also use the Array constructor to create an array.The constructor takes two parameters:
 *          1. The size of the array, and
 *          2. A function which accepts the index of a given element and returns the initial value of that element.
 *          Example:  val num = Array(3, {i-> i*1})
 *
 * Collections :
 *     A => Immutable Collections : Read Only Operations
 *          1. Immutable List : listOf
 *          2. Immutable Map : mapOf
 *          3. Immutable set : setOf
 *
 *     B => Mutable Collections : Read and Write Both
 *          1. Mutable List = ArrayList, arrayListOf, mutableListOf
 *          2. Mutable Map = HashMap, hashMapOf, mutableMapOf
 *          3. Mutable Set = mutableSetOf, hashSetOf
 *
 * Note: Internally, the index operator or [ ] is actually an overloaded operator (see operator overloading) and only
 * stands for calls to the get() and set() member functions.
 */
fun main() {

//    val array= Array<Int>(2,{ t-> 0})
//    val array= Array<Int>(2) { t -> 0 }
//    val array = Array<Int>(2) { 0 }
    val array = Array(5) { 0 } //


    for (index in array.indices) {
        println(array[index])
    }
    for (index in 0..4) {
        println(array[index])
    }
    for (index in 0..array.size - 1) {
        println(array[index])
    }

    array.forEach {
        println(it)
    }

    val arr = intArrayOf(12)
    arr.forEach {
        println("d $it")
    }


    //    val asssss = intArrayOf(1, 23, 45, 6, 76, 78)
//    val asssss = byteArrayOf(1, 23, 45, 6, 76, 78)
//    val asssss = floatArrayOf(1, 23, 45, 6, 76, 78)
//    val asssss = doubleArrayOf(1.0, 23.0)
//    val asssss = booleanArrayOf(true, false,true,false)
//    val asssss = longArrayOf(1, 23, 45, 6, 76, 78)
//    val asssss = longArrayOf(1, 23, 45, 6, 76, 78)
}