fun main(args:Array<String>){
    val a:Int = 10
    val b:Int = 8
    if (a>b){
        println("a is greater than b")
    }else{
        println("a is less than b")
    }

    //using and and or operators
    val c = 6
    val d = 5
    val e =7
    if (c > d || c > e){//&& is and and || is or operator
        print("c is greater than d or e")
    }
    else{
        print("c is less than d and e")
    }
}