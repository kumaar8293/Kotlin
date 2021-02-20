package com.oops

fun main() {
    println(MyClass.typeOfCustomer())      //Indian
    MyClass.count = 100
    println(MyClass.count)  //100
    MyClass.count = 122
    println(MyClass.count) //122
}

class MyClass {
    companion object {
        var count = -1          //Behaves like static variable
        @JvmStatic //To call from JAVA file
        fun typeOfCustomer(): String {      //Behaves like static method
            return "Indian"
        }
    }
}