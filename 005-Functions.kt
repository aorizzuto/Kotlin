

fun SayHi(param:String?):String{
    return "Hi " + param
}

fun SayHiSingleline(param:String):String = "Hi " + param

fun SayHiSingleline2(param:String) = "Hi $param"

fun SayHello(): Unit{
    println("Hello with no return")
}

fun SayWelcome(){
    println("Welcome with no return")
}



fun main() {
    var name: String = "Alejandro"

    println(SayHi(null))
    println(SayHi("notNull"))
    println(SayHiSingleline("Ale"))
    println(SayHiSingleline2("Seba"))

    SayHello()
    SayWelcome()
}