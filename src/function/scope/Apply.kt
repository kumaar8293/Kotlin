package function.scope

/**
 * Scope Functions : 'apply'
 *  Property 1: Refer to context object by using 'this'
 *  Property 2: The return value is the 'context object'
 *  Can't use with nullable object (without [?] null safe operator )
 *
 *  It change the values inside original object
 *
 */

fun main() {

//    val person = Person()
//    person.name = "Devesh"
//    person.age = 19

    val personNew = Person().apply {
        name = "Devesh"
        age = 19
    }

    val ageAfter5years = with(personNew) {
        //Do your work with person object
        println(name)
        println(age)
        age + 5
    }
    println("Person ${personNew.name} age after 5 years is $ageAfter5years")


}