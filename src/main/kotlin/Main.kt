fun main() {
    val forecast = Forecast()
//    forecast.setTownName()
//    forecast.setTownTemperature()
//    forecast.printForecast()
    val john: User = User("John", "Major")
    println(john.firstName)
    john.login = "Jack"

    val user = MainProvider()
    user.printInfo(john)
    print(user.getConnection())

    checkDataTypes((user))

    }

fun checkDataTypes(obj: MainProvider){
    if(obj is UserInfoProvider){
        obj.printInfo(User())
    }
    if (obj is DBConnection) {
        println(obj.getConnection())
    }
}