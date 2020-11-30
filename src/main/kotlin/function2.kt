fun main(){
    addition1(number2 = 4, number1 = 10)
    addition()
    subtraction()
    multiplication()
}
fun addition(){
    val number1 = 4
    val number2 = 5
    val addition = number1 + number2
    println("Your sum is $addition")
}
fun subtraction(){
    val number1 = 3
    val number2 = 3
    val subtraction = number1 - number2
    if (subtraction < 0){
    println("Your difference is $subtraction and it is a negative number")}
    else if (subtraction == 0){
        println("Your difference is $subtraction and it is zero")
    }

    else{
        println("Your difference is $subtraction and it is a positive number")
    }
}
fun multiplication(){
    val number1 = 6
    val number2 = 3
    val multiplication = number1 * number2
    println("Your Multiplication is $multiplication")
}