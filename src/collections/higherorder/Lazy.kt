package collections.higherorder

/**
 * -> "Lazy initialization" was designed to prevent unnecessary initialization of objects
 * -> Your variable will not be initialized unless you use it in your code
 * -> It is initialized only once. Next time when you use it, You get the value from the cache memory
 * -> It is thread safe
 *         => It is initialized in the thread where it is used for the first time.
 *          -> Other threads use the same value stored in the cache
 *
 * The variable can be var or val
 * The variable can be nullable or non-nullable
 */

val pi by lazy {
    3.14
}

fun main() {

    println("Some initial code")

    //Till here "pi" was not initialized (Means no memory allocated for pi variable)
    val area1 = pi * 4 * 4 // pi get initialized first time here (Allocated in memory)
    val area2 = pi * 4 * 4 // pi did not get initialized, got the value from cached because it was already initialized
    println("Some more code")
}