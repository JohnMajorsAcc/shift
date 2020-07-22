class MainProvider : UserInfoProvider, DBConnection {

    override val info: String
        get() = "Method called"

    override fun printInfo(user: User) {
        println("main provider: $info")
        super.printInfo(user)
    }

    override fun getConnection(): String {
        return  "DB connection"
    }
}