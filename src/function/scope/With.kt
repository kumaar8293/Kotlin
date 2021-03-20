package function.scope

import sealed.Response


/**
 * Scope Functions : 'with'
 *  Property 1: Refer to context object by using 'this'
 *  Property 2: The return value is the 'lambda result'
 *  Can't use with nullable object
 */
fun main() {

    val person: Person = Person()

//    println(person.name)
//    println(person.age)

    val ageAfter5years = with(person) {
        //Do your work with person object
        println(name)
        println(age)
        if (age < 18) {
            "Kids"
        } else {
            "Adult"
        }
    }
    println("Person ${person.name} age after 5 years is $ageAfter5years")

}
