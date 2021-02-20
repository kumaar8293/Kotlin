package com.oops

fun main() {
    val user1 = User("Sam", 12)
    val user2 = User("Sam", 12)

    println("${user1.hashCode()}  &&   ${user2.hashCode()}")
    println(user1 == user2)        //True

    val user3 = user2.copy()
    println(user2 == user3)


    println(user1.component1())

    val user4 = user3.copy(name = "Samm") //While making an copy we can change the value as well

}

 data class User(var name: String, var id: Int)  //Data class deals with data not the object