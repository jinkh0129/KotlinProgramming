package chap03.section01

fun sum(a:Int, b:Int) : Int{
    var sum = a+b;
    return sum;
}
/*
fun 함수 이름([변수이름:자료형, 변수이름:자료형,...]):[반환값의 자료형]{
    표현식...
    [return 반환값]
}
 */

fun sum1(a:Int,b:Int):Int{
    return a+b;
}
// 함수 안에서 별도의 변수를 정의하지 않고 다음과 같이 매개변수를 이용한 식을 바로 반환값에 입력해도 된다.

fun sum2(a:Int,b:Int):Int = a+b
// 중괄호 안의 코드가 한 줄이면 중괄호와 return문을 생략할 수도 있다. 이때 return문을 생략한 대신 대입 연산자(=)를 사용해야 한다.

fun sum3(a:Int,b:Int) = a+b
// 덧셈을 할 값들이 Int형이면 반환값도 Int형일 것이다. 이 점을 이용하면 반환값의 자료형도 생략할 수 있다.

fun main() {
    var result1 = sum(3,2);
    var result2 = sum(6,7);

    println(result1);
    println(result2);
}

// 함수를 선언할 때는 매개변수라고 부르고, 함수를 호출할 때는 인자라고 부른다.