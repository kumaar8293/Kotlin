package com.oops.lambda.kotlin


fun main() {


    val myFunc: (Int, Int) -> Int = { x, y -> x + y }

    val aa = AA()
    aa.addition(12, 24, myFunc)


}

class AA {

    fun addition(x: Int, y: Int, myFun: (Int, Int) -> Int) {
        val sum = myFun(x, y)
    }
}