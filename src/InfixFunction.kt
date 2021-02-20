fun main() {
    println(10.greaterValue(12))
    println(10 greaterValue 12) //Code readability, which is equals to above function
}

infix fun Int.greaterValue(num: Int) = this > num

//infix fun Int.greaterValue(num1: Int, num2: Int): Int {
//    Extension function but not can't be infix because 2 params there.
//    return if (num1 > num2)
//        num1
//    else num2
//}