package chap04.section01

fun main() {
    print("Enter the score : ")
    val score = readLine()!!.toDouble()
    // 콘솔로부터 입력받는 것
    // 세이프콜(?.)을 사용하면 null임을 의심하는 것이기 때문에 조건문에서 대소비교를 할 수 없다.
    // 그래서 non-null임을 단정하는 기호를 사용한 것이다.
    // 숫자가 아닌 문자를 입력받으면 NumberFormatException오류가 뜬다.
    /*
    readline()은 콘솔에서 문자열을 입력하고 엔터를 누르면 함수를 호출한 부분에 입력한 값이 변수에 반환된다.
     */
    var grade : Char = 'F'

    if(score>=90.0){
        grade = 'A'
    } else if(score>=80.0 && score<90.0){
        grade = 'B'
    } else if(score>=70.0 && score<80.0){
        grade = 'C'
    }

    println("Score : $score, Grade : $grade")
}

/*
<in연산자와 범위 연산자로 조건식 간략하게 만들기>
코틀린에서는 포함 여부 확인을 위한 in 연산자와 2개의 점(..)으로 구성된 범위(range)연산자를 제공한다.

변수 이름 in 시작값..마지막 값
--> 범위 연산자는 왼쪽의 값부터 오른쪽의 값까지 포함하는 범위를 계산한다.

if(score>=90){
    grade = 'A'
} else if(score in 80.0..89.9){
    grade = 'B'
}

 */