package chap02.section03

/*
Any형은 자료형이 특별히 정해지지 않은 경우에 사용한다.
클래스 Any형은 모든 클래스의 뿌리이다.
코틀린의 모든 클래스는 바로 이 Any형이라는 슈퍼클래스(SuperClass)를 가진다.

Any형은 무엇이든 될 수 있기 때문에 언제든 필요한 자료형으로 자동 변환할 수 있다. --> 묵시적 변환
 */

fun main() {
    var a : Any = 1; // Any형 a는 1로 초기화될 때 Int형이 됨.
    a = 20L; // Int형이었던 a는 변경된 값 20L에 의해 Long형이 됨.
    println("a : $a type : ${a.javaClass}"); // a의 자바 기본형을 출력하면 long이 나옴.
}
/*
a의 멤버 변수인 javaclass는 a가 어떤 기본형을 가지고 있는지 출력해준다.
 */