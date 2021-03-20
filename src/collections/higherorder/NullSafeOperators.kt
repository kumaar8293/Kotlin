package collections.higherorder

/**
 * 1. Safe call ( ?.) => Returns the length if name is not null else return NULL
 *                    => Use it if You don't mind getting null value
 *
 * 2. Safe call with let ( ?.let ) => It executes the block ONLY IF NAME IS NOT NULL
 *
 * 3. Elvis operator ( ?: ) => When we have nullable reference 'name', we can
 *                              say "is name is not null", use it
 *                              otherwise use some non-null value (kind of ternary operators in JAVA)
 *
 * 4. Non null assertion operation ( !! ) => Use it when you are sure that value is not null
 *                                         Throws NullPointerException if the value is find to be null
 */
fun main() {

    //WAP to find the length of the name
    var name: String? = "Mukesh"

    // 1. Safe call
    println("${name?.length}") // Output: 6

    // 2. Safe call with let
    name?.let {
        println(it.length)  // Output: 6
    }

    // 3. Elvis operator
   /* val length = if (name != null) {
        name.length
    } else {
        -1
    }*/
    val length = name?.length ?: -1  // Both are equals
    println(length)  // Output:6

   // 4. Non null assertion
    println(name!!.length) // Output:6

}