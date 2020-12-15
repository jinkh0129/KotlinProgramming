package chap02.section03

fun main() {
    val num = 256;

    if(num is Int){
        println(num);
    } else if(num !is Int){
        println("Not a Int");
    }
    /*
    변수의 자료형을 알아내는 방법은 is 키워드를 사용하는 것이다.
    is는 왼쪽 항의 변수가 오른쪽 항의 자료형과 같으면 true를, 아니면 false를 반환한다.
     */
    val x : Any;
    x = "Hello";
    if(x is String){
        println(x.length);
    }
    /*
    is는 변수의 자료형을 검사한 다음 그 변수를 해당 자료형으로 변환하는 기능도 있다.
    Any형을 사용하면 자료형을 결정하지 않은 채로 변수를 선언할 수 있다.
    is를 사용하여 자료형을 검사하면 검사한 자료형으로 스마트 캐스트가 된다.
     */
}