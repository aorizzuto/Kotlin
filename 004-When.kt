var testNull: String? = null 
var name: String = "Alejandro"

fun main() {
    
    when(testNull){
        null -> println("It's null")
        else -> println(name)
    }

    testNull="not null"
    when(testNull){
        null -> println("It's null")
        else -> println(name)
    }

}