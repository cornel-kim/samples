fun main(){
    //if else, else if and nested else if
//    val x = 16
//    if (x < 15){
//        println("X is less than 15")
//    }else{
//        println("Enter valid number")
//    }
    //value checker for number from 0-30
//    val x = 16
//    if (x < 15){
//        println("X is less than 15")
//    }else if(x > 15 && x < 30){//elif
//        println("x = $x, is greater than 15 but less than 30")
//
//    }
//    else{
//        println("Enter valid number")
//    }
    val temperature = 39.2f
    if(temperature>37.2f && temperature < 40.0f){
        println("You have high fever hence might have corona virus or any other disease")
        val cough = "Coughing"
        if(cough=="Coughin"){
            println("You have one more symptom for corona now please go check")
        }else{
            println("Check for other infections")
            val diarrhea = "True"
            if(diarrhea == "True"){
                println("Check for cholera or malaria")
            }
            else{
                println{"Check other disease like HIV"}
            }
        }
    }
    else if(temperature > 35.0f && temperature <=37.2f){
        println("Your temperature readings are of normal range")

    }
    else{
        println("Input valid temperature reading")
    }

}