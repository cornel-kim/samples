fun main(){
    val marks:Int = -15
    if (marks <= 100 && marks >=70){
        print("Your score is $marks, which is a A")
    }else if(marks >=60 && marks< 70){
        print("Your score is $marks, which is a B")
    }else if(marks >=50 && marks< 60){
        print("Your score is $marks, which is a C")
    }else if(marks >=40 && marks< 50){
        print("Your score is $marks, which is a D")
    }else if(marks >=0 && marks< 40){
        print("Your score is $marks, which is a E")
    }
    else{
        print("Please input valid marks")
    }
}