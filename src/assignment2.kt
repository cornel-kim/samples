fun main(){
    val BMI:Double = 23.5
    if (BMI< 18.5){
        print("under weight")
    }else if(BMI>=18.5 && BMI<=22.9){
        print("Normal")
    }else if(BMI>=23.0 && BMI<=24.9){
        print("Over weight")
    }else if(BMI>=25.0 && BMI<=29.9){
        print("Pre-Obesse")
    }else if(BMI>=30.0 && BMI<=34.9){
        print("Obesse class I")
    }else if(BMI>=35.0 && BMI<=39.9){
        print("Obesse class II")
    }else if(BMI>=40){
        print("Obesse class III")
    }else{
        print("input valid figures")
    }
}