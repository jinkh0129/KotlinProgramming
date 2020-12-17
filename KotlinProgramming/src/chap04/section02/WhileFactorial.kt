package chap04.section02

/*
<WHILE>
while문은 조건식이 true를 만족하는 경우 while문의 블록을 무한히 반복한다.
보통 while문의 본문에서 조건식이 false를 만족하도록 하는 문장을 넣어야 루프를 탈출할 수 있다. -->(ㄱ)
 */

fun main() {
    print("Enter the number : ")
    var number = readLine()!!.toInt()
    var factorial : Long = 1

    while (number>0){ // n x ... x 4 x 3 x 2 x 1
        factorial *= number
        --number // (ㄱ)에 해당하는 문장이다.
    }
    println(factorial)
}

/*
while문은 조건식을 항상 true로 해 무제한으로 반복하는 '데몬 프로그램'을 만들 때 쓰이기도 한다.
"데몬 프로그램"
 : 백그라운드에서 실행하면서 종료되지 않고 지속적으로 무엇인가 처리하는 프로그램이다.
   사용자가 직접 제어하지 않아도 특정한 작업을 지속적으로 처리할 수 있다.
 */