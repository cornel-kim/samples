fun main(){
    val a:Int = 7
    when{
        a < 10 ->{
            println("$a is less than 10")
            val y:Int = 3
            val sumVal:Int = y + a
            println("The new sum of values is $sumVal")
        }
        a==10 -> println("$a is equal to 10")
        a>10 -> println("$a is greater than 10")
        else-> println("Invalid") //means above condition were not met
    }
//    val marks:Int = 69
//    when{
//    marks in 70..100 ->  print("Your score is $marks, which is a A")
//    marks in 60..69 ->  print("Your score is $marks, which is a B")
//    marks in 50..59 -> print("Your score is $marks, which is a C")
//    marks in 40..49 -> print("Your score is $marks, which is a D")
//    marks in 0..39 -> print("Your score is $marks, which is a E")
//    else -> print("Please input valid marks")
//    }
}
//create a program using when loop to first check if your temperature is over or
// below 37.2, then give proper guidelines upon temperature reading i.e if
// temperature is over 37.2 recommend to visit a doctor else if less give guidelines
// to keep safe