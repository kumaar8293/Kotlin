package collections.higherorder


fun main() {
    val user1 = User(1, "Devesh", true)
    val user2 = User(2, "Mukesh", false)
    val user3 = User(3, "Monika", false)
    val user4 = User(4, "Aayusma", true)

    val (id, name, footballFan) = user1

    val users = arrayOf(user1, user2, user3, user4)
    val (footballFans, notFootballFan) = users.partition { it.isFootballFan }

    println(footballFans)
    println(notFootballFan)

}

private data class User(val id: Int, val name: String, val isFootballFan: Boolean)