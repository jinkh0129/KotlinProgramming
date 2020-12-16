package chap04.section01
/*
<인자가 없는 when 문>
인자가 주어지지 않으면 else if 문처럼 각각의 조건을 실행할 수 있다.
인자를 두지 않는 경우에는 조건이나 표현식을 직접 만들 수 있기 때문에 특정 인자에 제한하지 않고 다양한 조건을 구성할 수 있다.
 */

fun main() {
    print("Enter the score : ")
    var score= readLine()!!.toDouble()
    var grade:Char='F'
    // Char로 선언하고 큰 따옴표를 사용하면 안 된다. 작은 따옴표가 Char를 의미한다.

    when{
        score >= 90.0 -> grade='A'
        score in 80.0..89.9 -> grade='B'
        score in 70.0..79.9 -> grade='C'
        score < 70.0 -> grade='F'
    }
    // 인자 있는 when문과 다르게 조건식을 구성할 수 있음.
    println("Score : $score, Grade : $grade")
}
// 이 예제의 핵심은 score >= 90.0과 같이 변수와 조건식을 when문에 직접 사용한 것이다.