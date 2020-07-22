class User(var firstName: String = "Peter", var secondName: String = "Pen"){
    var login: String? = null
        set(value) {
            if(value.equals("Codi")){
                field = "None"
            } else {
                field = value
            }
            println("Значение переменной $field")
        }
        get(){
            val loginField = field ?: "неизвестно"
            println("Переменная равна: $loginField")
            return field
        }

    fun printUser() {
        println("$firstName $secondName")
    }
}