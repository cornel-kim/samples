fun main(){
    val studentMarks:Int = 405
    if (studentMarks > 400){
        val gender:String = "lay"
        if (gender == "lady") {
            println("You qualify to join a girls national school")
        }else{
            println("You qualify to join a boys national school")
        }
    }else if (studentMarks in 301..400){//studentMarks> 300 && studentMarks<=400
        println("You qualify for extra county school")
    }else if (studentMarks in 201..300){//studentMarks>200 && studentMarks<=300
        println("You qualify to join county school ")
    }else{
        println("Join any other school available")
    }
}