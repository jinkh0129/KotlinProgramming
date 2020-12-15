package chap03.section05
/*
일반적인 재귀에서는 재귀함수가 먼저 호출되고 계산이 되지만
꼬리 재귀에서는 계산을 먼저 하고 재귀함수가 호출된다.
 */

fun main() {
    val number=5
    println("Factorial : $number -> ${factorial2(number)}")
}

tailrec fun factorial2(n:Int, run:Int=1):Long{
    return if(n==1) run.toLong() else factorial2(n-1,run*n)
}