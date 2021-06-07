var ale: String = "Ale" // Global
var testNull: String? = null // I need to put "?" after type to indicate that can be null
var variableWithoutType = "This is a string"

fun main(args: Array<String>) {
    
    val name: String = "Hola Alejandro"
    //name = "test" // 002-Variables.kt:5:5: error: val cannot be reassigned

    var str: String = "Ale"
    str = "Seba"    // VAR can be reassigned
    println("str: " + str)

    println("ale (global): " + ale)

    println("testNull: " + testNull)

    println("No type variable: " + variableWithoutType)
}