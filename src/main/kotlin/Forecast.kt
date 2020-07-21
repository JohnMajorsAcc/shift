import java.lang.NullPointerException

class Forecast {
    var townTemperature: Int = -50
    var townName: String = ""

    fun setTownName(): String {
        print("Enter town name, please: ")
        townName = readLine().toString()
        if (townName.isEmpty()) {
            println("Empty string. Repeat, please!")
            return setTownName()
        } else return townName;
    }

    fun setTownTemperature(): Int {
        print("Enter temperature in town, please: ")
        try {
            this.townTemperature = readLine()?.toIntOrNull()!!
            return townTemperature

        } catch (e: NullPointerException){
            println("You entered wrong value, repeat please.")
            return setTownTemperature()
        }
    }

    fun printForecast() {
        val interpretedTempeature : String = getTemperatureInterpretation(townTemperature)
        println("In the $townName city is $interpretedTempeature now!")
    }

    private fun getTemperatureInterpretation(townTemperature: Int): String {
        return when(townTemperature){
            in -50..-25 -> "very cold"
            in -25..-5 -> "cold"
            in -10..15 -> "cool"
            in 15..25 -> "warm"
            in 25..50 -> "hot"
            else -> "catastrophe"
        }
    }
}



