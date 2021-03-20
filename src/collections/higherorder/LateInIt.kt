package collections.higherorder

/**
 * lateinit keyword=>
 *      A: Use it with mutable variables [var]
 *              -> lateint var name:String  [Allowed]
 *              -> lateinint val name:String [Not-Allowed]
 *
 *      B: Allowed with only non-nullable data type
 *              -> lateint var name:String  [Allowed]
 *               -> lateint var name:String?  [Not-Allowed]
 *
 * It is a promise to [Compiler] that the value will be initialized in future
 *
 * [Note] : If you try to access the "lateint" variable without initializing
 *          then it will throws "kotlin.UninitializedPropertyAccessException"
 */

fun main() {
    val country = Country()
//    country.setUp()
    println(country.name)  // kotlin.UninitializedPropertyAccessException

}

class Country {
    lateinit var name: String

    fun setUp() {
        if (!::name.isInitialized) {
            name = "Mukesh"
        }
        println(name)
    }
}