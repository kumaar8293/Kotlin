package learning

import java.util.*

data class Person(var firstName: String, var lastName: String, var age: Int)


fun main() {
    val person = arrayOf(
        Person("Mukesh", "Patel", 99),
        Person("Devesh", "Ailani", 19),
        Person("Aayushma", "Agrawal", 9),
        Person("Monika", "Bhasin", 199)
    )

//    val userList = mutableListOf<Person>()
//    for (user in person){
//        if (user.lastName.startsWith("A",true)){
//            userList.add(user)
//        }
//    }

    println(Arrays.toString(person))
    println(person.contentToString())

    person.filter { user: Person -> isValidUser(user) }
        .map { user: Person -> user.firstName }
        .forEach { println(it) }

}

fun isValidUser(person: Person): Boolean {
    return person.lastName.startsWith("A", true)
}