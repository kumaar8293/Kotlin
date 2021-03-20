package collections

fun main() {

    /**
     * Set Contains Unique value
     * HashSet also contains Unique value but sequence is not guaranteed in output
     */
    /**
     * Returns a new read-only set with the given elements.
     * Elements of the set are iterated in the order they were specified.
     * The returned set is serializable (JVM).
     */
    val mySet = setOf<Int>(1, 2, 4, 5, 6, 6, 7, 7, 88, 9, 9, 9) //Immutable Read only

//    for (item in mySet) {
//        println(item)  // 1,2,4,5,6,7,88,9
//    }

//    val mutableSet: MutableSet<Int> = mutableSetOf<Int>(1,11,3434,54,1, 2, 3, 4, 5, 6, 5, 7, 5)
//   Mutable, Not fixed, Sequence Matter , Read and Write Both

    val mutableSet = hashSetOf<Int>(12,34,54,2,1, 2, 3, 4, 5, 6, 5, 7, 5)
    //Mutable, Not fixed , Read and Write Both ,Sequence doesn't matter

//    val mutableSet = HashSet<Int>()
// Mutable, Not fixed , Read and Write Both, Cant have default value,Sequence doesn't matter

//    mutableSet.add(12)
//    mutableSet.remove(124)
    for (item in mutableSet) {
        println(item)  //NO GUARANTEED
    }
}