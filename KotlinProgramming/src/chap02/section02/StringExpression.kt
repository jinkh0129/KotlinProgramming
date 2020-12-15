package chap02.section2

fun main() {
    var a = 1;
    val str1 = "a = $a"; // 변수의 값을 문자열 안에 넣어 출력하고 싶을 때는 $(달러)기호를 함께 사용한다.
    val str2 = "a = ${a + 2}"; //문자열 안에 표현식을 사용할 때는 {}(중괄호)를 사용한다.

    println("str1: \"$str1\", str2: \"$str2\""); // 탈출문자 사용
    val special = "\"Hello\", I have \$15"; // $(달러)기호를 기호 그 자체로 사용하고 싶을 때 탈출문자를 사용한다.
}