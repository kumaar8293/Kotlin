import java.math.BigInteger

fun main(args: Array<String>) {
    val n = 10 //Without tailrec function it will through StackOverFlowException
    val first = BigInteger("0")
    val second = BigInteger("1")

    println(fibonacci(n, first, second))


    var a= ArrayList<String>()

    a?.get(0)?.let {
        print("asdasd")
    }
    print("werwerewrew")

}

tailrec fun fibonacci(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0) a else fibonacci(n - 1, b, a + b)
}