package sealed

import function.scope.Person

/**
 * Enum class can be used for constant
 * Enum class can have only same data type
 * Enum class deals with values
 *
 * Sealed class deals with TYPE not values
 * It can have multiple types of data/Object
 */

fun main() {

    val days = Days.MONDAY
    val resultss: String = when (days) {
        Days.MONDAY -> {
            days.sName
        }
        Days.TUESDAY -> {
            days.sName
        }
        Days.SUNDAY -> {
            days.sName
        }
    }

//    val day: Day = Day.Sunday("Sunday")
//    val result = when (day) {
//        is Day.Monday -> TODO()
//        is Day.Sunday -> TODO()
//        Day.Tuesday -> TODO()
//    }

    val response: Response = Response.Test()

    when (response) {
        is Response.Failed -> TODO()
        is Response.Success -> TODO()
        is Response.Test -> TODO()
        Response.Loading -> TODO()
    }
}

sealed class Response(val names: String = "ABC") {
    class Test : Response()
    class Success(val data: Person) : Response()
    data class Failed(val errorCode: Int, val message: String) : Response()
    object Loading : Response()
}

enum class Days(val sName: String) {
    SUNDAY("sunday"),
    MONDAY("monday"),
    TUESDAY("tuesday");
}

sealed class Day {
    class Sunday(val name: String) : Day()
    data class Monday(val date: Int) : Day()
    object Tuesday : Day()
}