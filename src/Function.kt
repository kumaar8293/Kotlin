class Function {
}

fun main() {
    run() //Normal function
    run("Kumar") //Kumar and 5
    //run(4) //CE: ERROR :The integer literal does not conform to the expected type String
    run(rollNumber = 4)//Mukesh and 4 (Named Arguments)
    run("Patel", 12) //Patel and 12

    max(12,23)//Function as expression || One line function
}

fun run() {
    println("Normal function")
}

fun run(name: String = "Mukesh", rollNumber: Int = 5) {
    println("$name & and $rollNumber")
}


fun max(num1: Int, num2: Int): Int = if (num1 > num2) { num1 } else { num2 }
