var testNull: String? = null 
var name: String = "Alejandro"

fun main() {
    
    if (testNull != null)
        println("Hello " + name)
    else
        println("testNull is null")


    testNull = "other"
    if (testNull != null)
        println("Hello " + name)
    else
        println("testNull is null")

    val stringToPrint = if (testNull != null) "Hello " + name else "null"
    println(stringToPrint)

}