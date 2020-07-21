class User(
    val firstName: String,
    val lastName: String

) {
    fun fullname(): String = "&firstName &lastName"
}

fun main() {
    val user = createuser()
    try {
        requireNotNull(user);
        println(user.firstName)
        print(user.lastName)
    } catch (e: IllegalArgumentException) {
        print("not user")
    }

}

fun createuser(): User? {
    return User("John", "Major")

}

