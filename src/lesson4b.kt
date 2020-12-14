fun main(){
    val weather = "sunny"
    if (weather=="sunny"){
        println("Wear light clothings")
        val signs = "Clear"
        val signs1 = "Cloudy"
        if (signs=="Clear"){
            println("Do not carry you jacket")
        }else if (signs1=="Cloudy"){
            println("Please carry your jacket")
        }
        else{
            println("The weather in not clear")
        }

    }
    else{
        println("Input valid weather patterns")
    }

}