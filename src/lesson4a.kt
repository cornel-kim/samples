fun main(){
    val c: Int = -0

    when{
        c > 0 -> print("It is a positive number")
        c == 0 -> print("It is zero")
        c < 0 -> print("It is a negative number")
        else-> print("input valid number")
    }
}