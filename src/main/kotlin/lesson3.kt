//when, while, for, break and continue

//when loop
fun main(){
    //check number if positive or negative
    val number:Int = -10
    when{
        number < 0 -> println("negative number")
        number == 0 -> println("number is zero")
        number > 0 -> println("number is positive")
        else-> println("Invalid")
    }
//    if(number < 0){
//        println("number is negative")
//    }else if(number == 0){
//        println("number is zero")
//    }
//    else{
//        println("number is negative")
//    }

    //check students marks
    when(val marks:Int = 90){ //we set some marks here. check range values
        in 1..30 -> println("You have $marks - Below average")//marks >0 && marks <30
        in 31..50 -> println("You have $marks - Average")
        in 51..75 -> println("You have $marks - Above average")
        in 76..99 -> println("You have $marks - Excellent")
        else -> println("You have $marks - Invalid Marks try again")
    }

}