package function.scope

/**
 * Scope Functions : 'also'
 *  Property 1: Refer to context object by using 'it'
 *  Property 2: The return value is the 'context object'
 *  Can't use with nullable object (without [?] null safe operator )
 *
 *  It is used to perform some extra operation after initializing the OBJECT
 */

fun main() {
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


    // Perform some other operation after Object is created
    // Suppose I wanna modify the Object //It make changes on the original object
    val duplicatePerson = personNew.also {
        it.name = "Mukesh Kumar Patel"
        println("New name is ${it.name}")
    }

    println("Original $personNew")
    println("Duplicate $duplicatePerson")   //Both will be same
}