package chap03.section01

fun main() {
    val num1=10;
    val num2=3;
    val result:Int;

    result=max(num1,num2);
    println(result);
}

fun max(a:Int,b:Int) = if(a>b) a else b

fun printSum(a:Int,b:Int) : Unit{
    println("Sum of $a and $b is ${a+b}");
}
// 함수의 반환값은 생략할 수 있다. 두 인자를 그대로 출력하는 것이다. 반환값이 없을 때는 반환값의 자료형 지정자리에 Unit자료형을 사용하거나 생략할 수 있다.
// Unit은 코틀린에서 다루는 특수한 자료형 중 하나로 반환값이 없을 때 사용한다.

fun printSum2(a:Int,b:Int){
    println("Sum of $a and $b is ${a+b}");
}
// 다음은 Unit을 생략한 것이다. 코틀린은 함수에서 반환값과 반환값의 자료형이 없으면 반환값의 자료형을 Unit으로 추론한다.