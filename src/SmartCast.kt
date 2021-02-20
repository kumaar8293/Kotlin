fun main() {
    val number = factorial(115)
    print(number)
}

fun factorial(number: Int): Int {
    return if (number == 1) {
        number
    } else {
        number * factorial(number - 1)
    }
}