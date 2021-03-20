package collections.higherorder

fun main() {
    var name: String? = null

    println("${name?.length}") //Output: null

    name?.let {
        println(it.length)  // Will not execute
    }

   /* val length = if (name != null) {
        name.length
    } else {
        -1
    }*/
    val length = name?.length ?: -1  // Both are equals
    println(length)  // Output: -1

   // 4. Non null assertion
    println(name!!.length) // kotlin.KotlinNullPointerException
}