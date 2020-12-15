package chap03.section03

fun main() {
    var result:Int;
    val multi={x:Int,y:Int -> x*y}; // 일반 변수에 람다식 할당
    result= multi(10,20); // 람다식이 할당된 변수는 함수처럼 사용 가능
    println(result);
}

// 함수 내용에 표현식이 2줄 이상이라면 마지막 표현식이 반환값(return)이 된다. 아래는 예다.
val multi2 : (Int,Int)->Int = {x:Int, y:Int ->
    println("x*y");
    x*y; // 마지막 표현식이 반환값이다.
}

/*
val multi : (Int,Int)->Int = {x:Int,y:Int -> x*y}
val multi : {x:Int,y:Int -> x*y}
val multi : (Int, Int)->Int = {x,y -> x*y}
셋 모두 같은 표현이다.
 */

val greet : () -> Unit = {println("Hello World")}
// 자료형은 () -> Unit이다. 람다식 본문을 보면 매개변수를 포함할 필요가 없으므로 화살표 앞쪽과 화살표 자체가 생략되었다.
// 함수의 반환값은 생략할 수 있는데, 반환값의 자료형을 Unit으로 지정하거나 생략할 수 있다.
val square: (Int) -> Int = {x->x*x}
// (Int) -> Int로 람다식의 자료형을 지정해 주었다. 람다식을 보고 매개변수와 반환값을 추론할 수 있다면 람다식의 매개변수 자료형을 생략할 수 있다.

/*
람다식의 자료형 생략
val greet = {println("Hello World")}
val square = {x:Int -> x*x}
val nestedLambda = {{println("Hello World"}}
 */
