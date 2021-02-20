package com.oops.lambda.kotlin

//Closure (We can change outside variable value inside lambda function, which is not possible in JAVA)

fun main() {
    var result = 0  // Outside variable > Not inside lambda
    val lambda3 = Lambda3()
    lambda3.addTwoNumber(12, 13) { x, y -> result = x + y }
    println(result)  // 25 > Value got change inside lambda function
}

class Lambda3 {
    fun addTwoNumber(a: Int, b: Int, action: (Int, Int) -> Unit) {
        val result = action(a, b)    // result = a + b = x + y = 12+ 13 = 25
    }
}