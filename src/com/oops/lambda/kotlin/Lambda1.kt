package com.oops.lambda.kotlin

//Simple
fun main() {
    val addition = Addition()
    addition.addTwoNumber(12, 20)    // 1 -> Simple way for better understanding

    addition.addTwoNumber(12, 12, object : AddInterface { // 2 -> Using interface, Object oriented way
        override fun execute(sum: Int) {
            println(sum)        //Body
        }
    })

    // 3 -> Lambda function [ function ]  { s -> println(s) } == this is a function without any name
    val myLambda: (Int) -> Unit = { s -> println(s) }
    val myLambda2: (Int) -> Unit = { println(it * it) }
    addition.addTwoNumber(12, 122, myLambda2)
}

class Addition {
    fun addTwoNumber(num1: Int, num2: Int, lambda: (Int) -> Unit) {     // 1 -> Simple way, for better understanding
        val sum = num1 + num2
        lambda(sum)
    }

    fun addTwoNumber(num1: Int, num2: Int, action: AddInterface) {  // 2 -> Using interface, Object oriented way
        val sum = num1 + num2
        action.execute(sum)
    }

    fun addTwoNumber(num1: Int, num2: Int) {  // 3 -> High level function with lambda as parameter
        val sum = num1 + num2
        println(sum)
    }
}

interface AddInterface {
    fun execute(sum: Int)
}