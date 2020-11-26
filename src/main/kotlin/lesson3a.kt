fun main(){
    var number:Int = 0
    while(number < 5){
        println("Looping through number = $number")
        number ++
    }

    var marks:Int = 499
    while (marks<=500){
        when(marks){
            in 0..200-> println("Join a local school")
            in 201..300 -> println("Join county school")
            in 301..400 -> println("join extra county school")
            in 401..500 -> println("Join national school")

            else -> println("invalid marks")

        }
        marks++
    }
}