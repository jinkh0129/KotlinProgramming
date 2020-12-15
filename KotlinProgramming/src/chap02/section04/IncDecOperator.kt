package chap02.section04

fun main() {
    var num1 = 10;
    var num2 = 10;
    var result1 = ++num1; // 증가 연산자를 앞에 쓰면 num1을 증가한 후 대입한다.
    var result2 = num2++; // 증가 연산자를 뒤에 쓰면 먼저 num2를 result2에 대입을 하고 증가시킨다. 즉 result2는 10, num2는 11이 된다.

    println("result1 : $result1"); // 11
    println("result2 : $result2"); // 10
    println("num1 : $num1"); // 11
    println("num2 : $num2"); // 11
}

/*
<논리 연산자>
&& : 모두 true여야 true
|| : 하나라도 true면 true
! : not

<산술 연산자>
+ - * / %(나머지)
 */