package collections.higherorder

/**
 * [Predicates] or A Condition that returns TRUE or FALSE
 *  "all" :Boolean -> Do all elements satisfy the Predicates/Condition
 *  "any" :Boolean -> Do any element in the LIST satisfy the Predicated/Condition
 *  "count" :Int -> Total elements that satisfy the Predicates/Condition
 *  "find" :Any -> Return the FIRST element that satisfy the Predicates/Condition
 *  "findLast" :Any -> Return the LAST element that satisfy the Predicates/Condition
 *
 *  [Note] => If list is empty then "all" will return TRUE and
 *          "any" will return FALSE
 *
 */

fun main() {

    val myNumbers = listOf<Int>(1, 4, 5, 10, 23, 54, 67, 99, 2)

    val check1 = myNumbers.all { it > 10 } // Are all elements greater than 10
    println(check1) // False

    val check2 = myNumbers.any { it > 10 } // Does any number is greater than 10
    println(check2) // True

    val totalNumber = myNumbers.count { it > 10 } // Total numbers greater than 10
    println(totalNumber) // 4

    val findFirst = myNumbers.find { it > 100 } //First number greater than 10, return null in default
    println(findFirst)  // 23

    val findLast = myNumbers.findLast { it > 10 } //Last number which is greater than 10
    println(findLast) // 99

    /**
     * Since all functions expecting same lambda function, We can store
     * in a variable and pass to all function
     *
     * val condition: (Int) -> Boolean = { number: Int -> number > 10 }
     * myNumbers.all(condition)
     * myNumbers.any(condition)
     * myNumbers.count(condition)
     * myNumbers.find(condition)
     * myNumbers.findLast(condition)
     */

    val politicians = listOf<Politician>(
        Politician("Narendra Modi", "BJP", 70),
        Politician("Rahul Gandhi", "Congress", 50),
        Politician("Amit Shah", "BJP", 56),
        Politician("Priyanka Gandhi", "Congress", 49),
        Politician("Mayawati", "BSP", 65)
    )

    val predicate = { politician: Politician -> politician.party == "BJP" }

    politicians.all(predicate).print()  // All members are from BJP = false
    politicians.any(predicate).print()  // Is Any member from BJP  = true
    politicians.find(predicate)?.print()  // Find first BJP member  = Politician(name=Narendra Modi, party=BJP, age=70)
    politicians.findLast(predicate)?.print()  // Finds Last BJP member = Politician(name=Amit Shah, party=BJP, age=56)
}

fun Any.print() {
    println(this)
}

data class Politician(var name: String, var party: String, var age: Int)