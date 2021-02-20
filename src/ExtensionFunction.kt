class ExtensionFunction {
}

fun main() {
    val student = Student()
    val marks = 50
    println("has passed ${student hasPassed marks}")
    println("is scholar ${student.isScholar(marks)}")

    val str1 = " My Name"
    val str2 = " Is"
    val str3 = "Mukesh"
    println(str3.appendStrings(str1, str2))
}

class Student {
    infix fun hasPassed(marks: Int) = marks > 40
    //Suppose it's a predefined class and want to add more properties
}

fun Student.isScholar(marks: Int): Boolean {
    return marks > 95
}

fun String.appendStrings(s1: String, s2: String): String {
    return this + s2 + s1
}
