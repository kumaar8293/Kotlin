package function.scope


/**
 * Scope Functions : 'let'
 *  Property 1: Refer to context object by using 'it'
 *  Property 2: The return value is the 'lambda'
 *  Use let to avoid NullPointerException
 */

fun main() {

    var person: Person? = null

    val nameLength = person?.let {
        //TODO you work
        println("Name is ${it.name}")

        it.name.length
    } ?: run {
        person = Person().apply {
            name = "Mukesh"
            age = 99
        }
        person!!.name.length
    }
    println(nameLength)
}