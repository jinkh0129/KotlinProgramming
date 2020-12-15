package chap03.section05

fun main() {
    // 일반 표현법
    //val mulit3.multiply(10)

    // 중위 표현법
    val multi= 3 multiply 10
    println("multi : $multi")
}


//Int를 확장해서 multiply() 함수를 하나 더 추가함
infix fun Int.multiply(x:Int):Int{ //infix로 선언되므로 중위함수를 의미한다.
    return this * x
}