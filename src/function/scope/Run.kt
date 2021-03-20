package function.scope


/**
 * Scope Functions : 'run'
 *  Property 1: Refer to context object by using 'this'
 *  Property 2: The return value is the 'lambda result'
 *
 *  It is like combination of LET + WITH
 *       Using the 'run' function you can leverage the power of both 'with' and 'let' function
 *
 * If you wanna operate on a nullable object and avoid NullPointerException then use 'run'
 */

fun main() {

    val person: Person? = null

//    val ageAfter5years = with(person) {
//        //Do your work with person object
//        println(name)
//        println(age)
//        age + 5
//    }

    val ageAfter5years = person?.run {
        //Do your work with person object
        println(name)
        println(age)
        age + 5
    }

    println("Person ${person?.name} age after 5 years is $ageAfter5years")

}