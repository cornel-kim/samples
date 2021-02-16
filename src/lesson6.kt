
fun main(args: Array<String>) {
//loop through ints....
    var numbers = arrayOf(35,66,77,55,66,55,44)
//    check if the first number is even or odd
     val evenNo = numbers.find { it % 2 == 0 }
    println("The number is even, its value is $evenNo")
//check if the last number is even or odd
 val lastNo = numbers.findLast { it % 2 == 0 }
    println("The last number is even, its value is $lastNo")
    //sort array
    numbers.sort()
    println("Minimum: ${numbers.first()}")//minimum value
    println("Maximum: ${numbers.last()}")//maximum value

//    for (number in numbers){
//        println("$numbers[$number]")
//    }

}