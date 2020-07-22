interface UserInfoProvider {
    val info: String
    fun printInfo(user : User){
        println("${user.firstName} ${user.secondName}")
    }
}