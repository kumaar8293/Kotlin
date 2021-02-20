package com.oops

fun main() {
    println(CustomerData.typeOfCustomer())      //Indian
    CustomerData.count = 100
    println(CustomerData.count)  //100
    CustomerData.count = 122
    println(CustomerData.count) //122
    CustomerData.myMethod() // MySuperClass : myMethod then CustomerData : myMethod
}
open class MySuperClass {
    open fun myMethod() {
        println("MySuperClass : myMethod")
    }
}

object CustomerData : MySuperClass() {
    var count = -1          //Behaves like static variable

    fun typeOfCustomer(): String {      //Behaves like static method
        return "Indian"
    }

    override fun myMethod() {       //Behaves like static method
        super.myMethod() // MySuperClass : myMethod
        println("CustomerData : myMethod")
    }
}