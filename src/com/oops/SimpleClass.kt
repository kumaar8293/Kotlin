package com.oops

fun main() {
    val myClass = myClass("Muke", 12)
}

class myClass(var name: String) {

    constructor(name: String, id: Int) : this(name, id, "mypassword") {
        println("this executes next")
        println("Name = ${name}")
        println("Id = ${id}")
    }

    constructor(name: String, id: Int, pass: String) : this(name) {
        println("this executes first")
        println("Name = $name")
        println("Id = ${id}")
        println("Password = ${pass}")
    }
}