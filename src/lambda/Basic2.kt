package lambda


/**
 * All the points is related to lambda function only
 * If the last parameter to a function is lambda expression then we can remove () braces
 * We can also remove the params type people :People ->  == people ->
 * If there is only one params then we can remove it with "it"
 */

fun main() {

    val people = arrayOf(
        People("Mukesh", "Patel", 99),
        People("Devesh", "Ailani", 19),
        People("Aayushma", "Agrawal", 9),
        People("Monika", "Bhasin", 999)
    )

    println(people)
//    println(Arrays.toString(people))
//    println(people.contentToString())
    val result = people.filter({ people: People -> people.lastName.startsWith("A") })
    println(result)

    val mappedName = people
        .filter({ people: People -> people.lastName.startsWith("A") })
        .map { people :People -> people.firstName  }

    println(mappedName)


    people
        .filter({ people: People -> people.lastName.startsWith("A") })
        .map { peopleNew :People -> peopleNew.firstName  }
        .forEach { name :String-> println(name) }

    people
        .filter { people: People -> people.lastName.startsWith("A") }
        .map { peopleNew :People -> peopleNew.firstName  }
        .forEach { name :String-> println(name) }

    people
        .filter { people -> people.lastName.startsWith("A") }
        .map { peopleNew  -> peopleNew.firstName  }
        .forEach { name -> println(name) }

    people
        .filter { it.lastName.startsWith("A") }
        .map { it.firstName  }
        .forEach { println(it) }


    println("Data  ${people.filter { getLambdaFunction(it) }}")


}

fun getLambdaFunction(people: People): Boolean {
    return people.lastName.startsWith("A")
}

data class People(var firstName: String, var lastName: String, var age: Int)