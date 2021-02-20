package com.oops

fun main() {
    // val person = Person()   //Cannot create an instance of an abstract class
}

abstract class Person { // You can't create object of Abstract class
    abstract var name: String  // Can't be initialised
    abstract fun eat()        // Abstract properties are by default "open"
    open fun sleep() {}       // A 'open' function ready to overridden
    fun run() {}        // A normal function are by default public and final
}

class Indian : Person() {
    override var name: String = "Dummy Indian Name"
    override fun eat() {
        //Write ur code
    }
}