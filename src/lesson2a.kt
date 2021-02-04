fun main(args: Array<String>){
    //example 1
    val a:Int = 4
    val b:Int = 5
    //logical operators
    if (a < b){
        println("$a is less than $b")
    }else{
        println("$a is greater than $b")
    }

    //example 2
    val x:Int = 12
    val y:Int = 10
    if (x > y){
        println("$x is greater than $y")
    }else{
        println("$x is less than $y")
    }
    //example 3
    val j:Int = 9
    val k:Int = 7
    if (j == k){
        println("$j is equals to $k")
    }else{
        println("$j is not equals to $k")
    }
    //example 4
    val d:Int = 5
    val e:Int = 6
    if (d != e){//not equals to
        println("$d is not equals to $e")
    }else{
        println("$d is equals to $e")
    }

    val g:Int = 5
    val h:Int = 6
    if (g <= h){
        println("$g is less or equals to $h")
    }else{
        println("$g is greater than $h")
    }

    val o:Int = 9
    val p:Int = 6
    if (o >= p){
        println("$o is greater or equals to $p")
    }else{
        println("$o is less than $p")
    }

    val number:Int = 4
    val number1:Int = 3
    val total:Int = number + number1
    if (total == 7){
        print("The output is correct, the value of 4 plus 3 is $total")
    }
    else{
        print("the answer is not 7")
    }
    // confirm that 4 plus 3 is 7
    //confirm that the answer is 7 and not 6


}
