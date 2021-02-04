fun main (){
    val number:Int = 0
//    if (number < 0){
//        print("it is a negative number")
//    }else{
//        print("it is a positive number")
//    }
    val result = if (number < 0){
        "it is a negative number"
    }else if(number ==0) {
        "the number is zero"
    }else{
        "it is a positive number"
    }
    print("$result")
}