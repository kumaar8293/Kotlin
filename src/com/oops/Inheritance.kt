package com.oops

open class Employee(name: String, age: Int, salary: Float) {

    init {
        println("Name is $name.")
        println("Age is $age")
        println("Salary is $salary")
    }

    open fun officeRules() {
        println("Common rules...")
    }
}

class Programmer(name: String, age: Int, salary: Float) : Employee(name, age, salary) {
    fun doProgram() {
        println("programming is my passion.")
    }

    override fun officeRules() {
        //super.officeRules()
        println("Override the rules")
    }
}

class Salesman(name: String, age: Int, salary: Float) : Employee(name, age, salary) {
    fun fieldWork() {
        println("travelling is my hobby.")
    }

    override fun officeRules() {
        super.officeRules()
        println("Additional rules")
    }
}

fun main() {
    val obj1 = Programmer("Ashu", 25, 40000f)
    obj1.doProgram()
    val obj2 = Salesman("Ajay", 24, 30000f)
    obj2.fieldWork()
}



