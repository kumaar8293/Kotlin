package collections

import java.util.ArrayList

fun main() {

    val list = listOf<String>("Mukesh", "Devesh", "Aayushma", "Monika") //Immutable, Fixed and Read Only
//  list[0]="XYZ" // Can't do
    list.forEach {
        println(it)
    }
    /**
     * A generic ordered collection of elements that supports adding and removing elements.
     * Params: E - the type of elements contained in the list.
     * The mutable list is invariant in its element type.
     */

    val mutableList: MutableList<String> = mutableListOf<String>("Mukesh", "Devesh", "Aayushma", "Monika") // Mutable, Read, Write, Add and Remove
//    val mutableList: ArrayList<String> = arrayListOf<String>("Mukesh", "Devesh", "Aayushma", "Monika") // Mutable, Read, Write, Add and Remove
//    val mutableList: ArrayList<String> = ArrayList<String>() // Mutable, Read, Write, Add and Remove, It can't have default values
    mutableList.add("XYZ")
}

