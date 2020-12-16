package chap04.section01

/*
조건식에는 Boolean 자료형이 들어가야 한다.
수행할 문장이 하나인 경우에는 블록 구문인 중괄호를 생략할 수 있다.
 */

/*
var max : Int
if(a>b)
    max = a
else
    max = b


val max = if(a>b) a else b
--> 조건문을 한 줄에 구성할 때는 조건식에 따라 a또는 b를 max에 할당하도록 변수
이름 단독으로 쓸 수 있다.
 */

fun main() {
    val a=12;
    val b=5;

    val max = if(a>b){
        println("a 선택");
        a // 블록의 마지막 표현식이 변수(max)에 반환되어 할당된다.
    }
    else{
        println("b 선택")
        b // 블록의 마지막 표현식이 변수(max)에 반환되어 할당된다.
    }

    println(max)
}