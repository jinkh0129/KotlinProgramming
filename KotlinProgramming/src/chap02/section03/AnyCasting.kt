package chap02.section03

fun main() {
    var a : Any = 1; // Any형 a는 1로 초기화될 때 Int형이 됨.
    a = 20L; // Int형이었던 a는 변경된 값 20L에 의해 Long형이 됨.
    println("a : $a type : ${a.javaClass}"); // a의 자바 기본형을 출력하면 long이 나옴.
}
/*
a의 멤버 변수인 javaclass는 a가 어떤 기본형을 가지고 있는지 출력해준다.
 */