fun main(){
    val card:String = "Inserted Correctly"
    if (card == "Inserted Correctly"){
        val pin:Int = 1234
        if (pin == 1234){
           val deposit:Int = 4000
            val bankBalance:Int = 500
            if (deposit== 4000){
                val Totalbalance:Int = deposit + bankBalance
                print("Your new balance is $Totalbalance")

            }else{
                print("You made no deposit or withdrawal")
            }
        }else{
            print("Wrong pin")
        }
        //0725868383

    }else{
        print("Please insert your card correctly")
    }
}