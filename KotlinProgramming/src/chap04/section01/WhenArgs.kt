package chap04.section01
/*
<인자를 사용하는 when문>
(1) true, false, 변수, 표현식 등의 조건을 when의 인자로 넣으면 when문을 구성할 수 있다.
(2) 일치되는 조건을 한 번에 여러 개 표현하려면 쉼표(,)를 사용하면 된다.
(3) when문에 함수의 반환값을 사용할 수도 있다.
(4) in연산자와 범위 지정자 사용하기
(5) is 키워드와 함께 사용하기

when(인자){
    인자에 일치하는 값 혹은 표현식 --> 수행할 문장
    인자에 일치하는 범위 --> 수행할 문장
    ...
    else -> 수행할 문장(블록 사용 가능)
}

(예시 1)
when(x) {
    1 -> print("x == 1")
    2 -> print("x == 2")
    else -> {
        print("x는 1,2가 아닙니다.")
    }
}
(예시 2)
when(x) {
    0,1 -> print("x == 0 or x == 1")
    else -> print("기타")
}
(예시 3)
when(x){
    parseInt(s) -> print("일치함")
    else -> print("기타")
}
(예시 4)
when(x){
    in 1..10 -> print("x는 1이상 10 이하입니다.")
    !in 10..20 -> print("x는 10 이상 20 이하의 범위에 포함되지 않습니다.")
    else -> print("x는 어떤 범위에도 없습니다.")
}
(예시 5)
val str = "안녕하세요"
val result = when(str){
    is String -> "문자열입니다."
    else -> false
}
 */

fun main() {
    print("Enter the score : ")
    val score = readLine()!!.toDouble()
    var grade : Char = 'F' // grade 변수의 값을 초기화

    when(score){
        in 90.0..100.0 -> grade ='A'
        in 80.0..89.9 -> grade='B'
        in 70.0..79.9 -> grade='C'
        !in 70.0..100.0 -> grade='F'
    }
    println("Score : $score, Grade : $grade")
}