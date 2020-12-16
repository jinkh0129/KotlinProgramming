package chap04.section01
/*
when문의 인자로서 Any를 사용하게 되면
다양한 자료형의 인자를 받을 수 있다.
 */
fun main() {
    cases("Hello") // (1) String형
    cases(1) // (2) Int형
    cases(System.currentTimeMillis()) // (3) 현재시간(밀리초 단위)을 Long형 값으로 반환
    cases(MyClass()) // (4) 객체
}

fun cases(obj:Any){ // 변수의 자료형을 선언
    when(obj){
        1 -> println("Int : $obj")
        "Hello" -> println("Srting : $obj")
        is Long -> println("Long : $obj")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}

class MyClass(){

}