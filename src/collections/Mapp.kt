package collections

import java.util.HashMap

fun main() {

    /**
     * Returns a new read-only map with the specified contents, given as a list of pairs where the first value is the key and the second is the value.
    If multiple pairs have the same key, the resulting map will contain the value from the last of those pairs.
    Entries of the map are iterated in the order they were specified.
    The returned map is serializable (JVM).
     */
    val map = mapOf<Int, String>(    //Immutable , Fixed , Read Only
        1 to "Mukesh",
        2 to "Devesh",
        0 to "Aayushma",
        99 to "Monika"
    )
    for (key in map.keys) {
        println("Element as $key = ${map[key]}")
//        println(map.get(key))   //Same
    }

//    val mutableMap= HashMap<Int,String>() //Mutable, Not fixed ,Read and Write , Can't add default values
//    val mutableMap: HashMap<Int, String> = hashMapOf<Int,String>(22 to "MAD") //Mutable, Not fixed ,Read and Write
    val mutableMap: MutableMap<Int, String> =
        mutableMapOf<Int, String>(22 to "MAD") //Mutable, Not fixed ,Read and Write

    mutableMap[1] = "Mukesh"
    mutableMap[2] = "Devesh"
    mutableMap.put(3, "Aayushma")
    mutableMap.put(4, "Monika")
}