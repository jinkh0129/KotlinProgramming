package chap02.section2

fun main() {
    val code : Int = 65;
    val chFromCode: Char = code.toChar();
/* 정수 자료형을 이용하여 문자 자료형을 선언할 때 쓰는 방법이다.
   정숫값을 변환하는 함수 toChar()를 이용하여 문자 자료형을 선언하면 된다.
 */
    val ch3 = '\uD55C'
    println(chFromCode);
    println(ch3);

    val str1 : String = "Hello";
    val str2 = "World";
    val str3 = "Hello";

    println("str1 === str2: ${str1 === str2}");
    println("str1 === str3: ${str1 === str3}"); // ===는 참조 비교를 위한 연산자이다. 둘은 참조하는 곳이 같으므로 true를 반환한다.
    /*
    같은 문자열이 저장되면 스택에 2번 저장하는 것보다
    이미 저장된 값을 활용하는 것이 효율적이다.
    그래서 코틀린은 힙 영역에 String Pool이라는 공간에 문자열 "Hello"를 저장해 두고 이 값을 str1, str3이 참조하도록 만든다.
     */



}