fun main(){
    val numbers = intArrayOf(23, 6, 67, 25, 97, 2, -4)
    //initialize the smallest number with the first element of the array
    var smallestNo = numbers[0]
    //loop through/iterate through the array
    for (item in numbers.indices){
        //compare the elements of the array with smallest value and
            // when the condition is true, make the smallest value to that of the element
        if (numbers[item] < smallestNo)
            smallestNo = numbers[item]
    }
    println("The smallest number is $smallestNo")
}