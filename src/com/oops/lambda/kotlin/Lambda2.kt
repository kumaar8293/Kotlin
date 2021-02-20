package com.oops.lambda.kotlin

//Way's of defining lambda
fun main() {
    val obj = Lambda2()
    val lambda: (Int, Int) -> Int = { x, y -> x + y } // 1 way
    obj.addTwoNumber(12, 13, lambda)
    obj.addTwoNumber(12, 13, { x, y -> x + y })  // 2nd Way
    obj.addTwoNumber(12, 13) { x, y -> x + y }  // 3rd Way
}

class Lambda2 {
    fun addTwoNumber(num1: Int, num2: Int, action: (Int, Int) -> Int) {
        val sum = action(num1, num2)    // num1+num2 = x+y = 12+13 =25
        println(sum)
    }
}