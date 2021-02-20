package com.oops.lambda.kotlin

// Use of "it" inside lambda function
fun main() {
    val lambda4 = Lambda4()
//    lambda4.reverseString("Mukesh") { s -> s.reversed() }
    lambda4.reverseString("Mukesh") { it.reversed() }   //If lambda function have only one params then we can
                                                              // replace it with "it" keyword
}
class Lambda4 {
    fun reverseString(string: String, action: (String) -> String) {
        val result = action(string)         // it.reversed() => string.reversed() => "Mukesh".reversed() =>"hsekuM"
        print(result)
    }
}