import java.lang.reflect.Array

class Ranges {
    val r1 = 1..5 // 1,2,3,4,5
    val r2 = 5 downTo 1 // 5,4,3,2,1
    val r3 = 1..5 step 2 // 1,3,5
    val r4 = 5 downTo 1 step 2 // 5,3,1
    val r5 = "A".."Z"// "A","B",....."Z"
    val r6 = 'a'..'z'//"a","b"......."z"
    val isPresent = 'c' in r6 // true
    val r7 = 1.rangeTo(5)//1,2,3,4,5
    val r8 = 5.downTo(1)//5,4,3,2,1

}

fun main() {
    val r1 = 1..5 // 1,2,3,4,5
    val r2 = 5 downTo 1 // 5,4,3,2,1
    val r3 = 1..5 step 2 // 1,3,5
    val r4 = 5 downTo 1 step 2 // 5,3,1
    val r5 = "A".."Z"// "A","B",....."Z"
    val r6 = 'a'..'z'//"a","b"......."z"
    val isPresent = 'c' in r6 // true
    val r7 = 1.rangeTo(5)//1,2,3,4,5
    val r8 = 5.downTo(1)//5,4,3,2,1
    val r9 = 1 until 5//1.2.3.4
}