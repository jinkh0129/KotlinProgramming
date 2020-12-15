package chap03.section05

// factorial 재귀함수로 스택 오버플로 경험하기
fun main() {
    val number = 4
    val result : Long

    result=factorial(number)
    println("Factorial : $number -> $result")
}

fun factorial(n:Int):Long{
    return if(n==1) n.toLong() else n* factorial(n-1)
}